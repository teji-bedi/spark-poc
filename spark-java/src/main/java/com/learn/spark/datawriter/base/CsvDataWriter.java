package com.learn.spark.datawriter.base;

import org.apache.spark.sql.Dataset;

public class CsvDataWriter<T> implements DataWriter<T>{

    @Override
    public void writeData(Dataset<T> data, String path) {
        data.write().csv(path);
    }
}
