package com.learn.spark.datareader.base;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;

public interface ParquetDataReader<T> extends DataReader<T> {

    default Dataset<T> getParquetData(String path, Encoder<T> encoder) {
        return getDataReader().csv(path).as(encoder);
    }


}
