package com.learn.spark.datareader;

import com.learn.spark.bo.LinkBo;
import com.learn.spark.bo.RatingBo;
import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class RatingDataReader implements CsvDataReader<RatingBo>, ParquetDataReader<RatingBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\spark-poc\\data\\input\\movielens\\ratings.csv";
    @Override
    public Dataset<RatingBo> getData() {
        return  getCsvData(path, Encoders.bean(RatingBo.class));
    }
}