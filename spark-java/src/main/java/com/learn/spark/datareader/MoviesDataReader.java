package com.learn.spark.datareader;

import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import com.learn.spark.bo.MovieBo;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class MoviesDataReader implements CsvDataReader<MovieBo>, ParquetDataReader<MovieBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\spark-poc\\data\\input\\movielens\\movies.csv";
    @Override
    public Dataset<MovieBo> getData() {
        return  getCsvData(path, Encoders.bean(MovieBo.class));
    }
}
