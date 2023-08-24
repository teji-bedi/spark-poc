package com.learn.spark.datareader;

import com.learn.spark.bo.LinkBo;
import com.learn.spark.datareader.base.CsvDataReader;
import com.learn.spark.datareader.base.ParquetDataReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

public class LinkDataReader  implements CsvDataReader<LinkBo>, ParquetDataReader<LinkBo> {

    private static final String path = "D:\\Workspace\\codebase\\spark-poc\\spark-poc\\data\\input\\movielens\\links.csv";
    @Override
    public Dataset<LinkBo> getData() {
        return  getCsvData(path, Encoders.bean(LinkBo.class));
    }
}