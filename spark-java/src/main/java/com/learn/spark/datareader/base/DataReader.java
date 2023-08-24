package com.learn.spark.datareader.base;

import com.learn.spark.base.SparkSessionProvider;
import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;

public interface DataReader<T>  {

    default DataFrameReader getDataReader(){
        return SparkSessionProvider.spark.read();
    }

    Dataset<T> getData();

}
