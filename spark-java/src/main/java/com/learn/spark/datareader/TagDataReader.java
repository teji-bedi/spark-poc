package com.learn.spark.datareader;

import com.learn.spark.bo.TagBo;
import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class TagDataReader implements CsvDataReader<TagBo>, ParquetDataReader<TagBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\tags.csv";

    @Override
    public Dataset<TagBo> getData() {
        return getCsvData(path, Encoders.bean(TagBo.class));
    }
}