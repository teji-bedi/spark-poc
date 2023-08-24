package com.learn.spark.datareader;

import com.learn.spark.bo.GenomeScoreBo;
import com.learn.spark.bo.LinkBo;
import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class GenomeScoreDataReader implements CsvDataReader<GenomeScoreBo>, ParquetDataReader<GenomeScoreBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\spark-poc\\data\\input\\movielens\\genome-scores.csv";
    @Override
    public Dataset<GenomeScoreBo> getData() {
        return  getCsvData(path, Encoders.bean(GenomeScoreBo.class));
    }
}