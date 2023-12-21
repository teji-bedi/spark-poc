package com.learn.spark.datareader.base;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;

public interface CsvDataReader<T> extends DataReader<T> {

    default Dataset<T> getCsvData(String path, Encoder<T> encoder) {
        return getDataReader().option("header", true).option("inferSchema", "true").csv(path).as(encoder);
    }
}
