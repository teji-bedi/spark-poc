package com.learn.spark.calculator;

import com.learn.spark.bo.*;
import com.learn.spark.bo.mapfunctions.MovieBoMapFunction;
import com.learn.spark.datareader.*;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.catalyst.plans.Inner;
import scala.Tuple1;
import scala.Tuple2;

import static org.apache.spark.sql.Encoders.bean;
import static org.apache.spark.sql.Encoders.tuple;

public class Calculator {
    public static void main(String[] args) {
        Dataset<MovieBo> movieData = new MoviesDataReader().getData();
        Dataset<LinkBo> linkData = new LinkDataReader().getData();
        Dataset<RatingBo> ratingData = new RatingDataReader().getData();
        Dataset<TagBo> tagData = new TagDataReader().getData();
        Dataset<GenomeScoreBo> genomeScoreData = new GenomeScoreDataReader().getData();
        Dataset<GenomeTagBo> GenomeTagData = new GenomeTagDataReader().getData();


        movieData.show(5);

        Dataset<Tuple2<MovieBo, LinkBo>> moviesJoinedWithLinks =
                movieData.joinWith(linkData,
                                movieData.col("movieId").equalTo(linkData.col("movieId")),
                                Inner.sql())
                        .as(tuple(bean(MovieBo.class), bean(LinkBo.class)));

        Dataset<MovieBo> moviesDataAfterJoin = moviesJoinedWithLinks.map(
                (MapFunction<Tuple2<MovieBo, LinkBo>, MovieBo>) movieBoLinkBoTuple2 -> MovieBo.builder()
                        .movieId(movieBoLinkBoTuple2._1.getMovieId())
                        .title(movieBoLinkBoTuple2._1.getTitle())
                        .genres(movieBoLinkBoTuple2._1.getGenres())
                        .build(), bean(MovieBo.class));

        Dataset<MovieBo> t = moviesJoinedWithLinks.map(new MovieBoMapFunction(), bean(MovieBo.class));

        moviesJoinedWithLinks.show(5, false);
        moviesDataAfterJoin.show(5, false);

    }
}
