package com.learn.spark.base;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

public class SparkSessionProvider {
    private SparkSessionProvider() {
    }

    public static final SparkSession spark = SparkSession.builder().config(buildConfig()).getOrCreate();

    private static SparkConf buildConfig() {
        SparkConf conf = new SparkConf();
        conf.setAppName("Test");
        conf.setMaster("local[*]");
        return conf;
    }
}
