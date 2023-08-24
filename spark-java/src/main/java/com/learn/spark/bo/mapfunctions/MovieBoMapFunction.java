package com.learn.spark.bo.mapfunctions;

import com.learn.spark.bo.LinkBo;
import com.learn.spark.bo.MovieBo;
import org.apache.spark.api.java.function.MapFunction;
import scala.Tuple2;

public class MovieBoMapFunction implements MapFunction<Tuple2<MovieBo, LinkBo>, MovieBo> {
    @Override
    public MovieBo call(Tuple2<MovieBo, LinkBo> tuple) throws Exception {
        return MovieBo.builder()
                .movieId(tuple._1.getMovieId())
                .title(tuple._1.getTitle())
                .genres(tuple._1.getGenres())
                .build();
    }
}
