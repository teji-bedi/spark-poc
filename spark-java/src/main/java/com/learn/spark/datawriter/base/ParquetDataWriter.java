package com.learn.spark.datawriter.base;

import org.apache.spark.sql.Dataset;

public class ParquetDataWriter <T> implements DataWriter<T>{

    @Override
    public void writeData(Dataset<T> data, String path) {
        data.write().parquet(path);
    }
}
