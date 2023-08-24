package com.learn.spark.datawriter.base;

import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;

public interface DataWriter<T> {


//    default DataFrameReader getDataWriter(){
//        return SparkSessionProvider.spark.write();
//    }

    void writeData(Dataset<T> data, String path);
}
