package com.scala.learn.spark.base

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait ScalaSparkSessionProvider {

  val spark: SparkSession = SparkSession.builder.config(buildConfig).getOrCreate
  spark.sparkContext.setLogLevel("ERROR")

  private def buildConfig = {
    val conf = new SparkConf
    conf.setAppName("Test")
    conf.setMaster("local[*]")
    conf.set("spark.eventLog.enabled", "false")
    conf
  }
}
