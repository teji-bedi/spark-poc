package com.learn.spark.calculator;

import com.learn.spark.bo.*;
import com.learn.spark.datareader.*;
import org.apache.spark.sql.Dataset;

public class Calculator {
    public static void main(String[] args) {
        Dataset<MovieBo> movieData = new MoviesDataReader().getData();
        Dataset<LinkBo> linkData = new LinkDataReader().getData();
        Dataset<RatingBo> ratingData = new RatingDataReader().getData();
        Dataset<TagBo> tagData = new TagDataReader().getData();
        Dataset<GenomeScoreBo> genomeScoreData = new GenomeScoreDataReader().getData();
        Dataset<GenomeTagBo> GenomeTagData = new GenomeTagDataReader().getData();
        movieData.show(false);
        linkData.show(false);
        ratingData.show(false);
        tagData.show(false);
        genomeScoreData.show(false);
        GenomeTagData.show(false);
    }
}
