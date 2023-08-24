package com.learn.spark.datareader;

import com.learn.spark.bo.GenomeScoreBo;
import com.learn.spark.bo.GenomeTagBo;
import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class GenomeTagDataReader implements CsvDataReader<GenomeTagBo>, ParquetDataReader<GenomeTagBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\spark-poc\\data\\input\\movielens\\genome-tags.csv";
    @Override
    public Dataset<GenomeTagBo> getData() {
        return  getCsvData(path, Encoders.bean(GenomeTagBo.class));
    }
}