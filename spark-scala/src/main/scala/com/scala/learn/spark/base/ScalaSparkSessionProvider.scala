package com.scala.learn.spark.base

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait ScalaSparkSessionProvider {

  val spark: SparkSession = SparkSession.builder.config(buildConfig).getOrCreate
  spark.sparkContext.setLogLevel("ERROR")
  println("----------------------"+ spark.conf.get("spark.eventLog.enabled"))

  private def buildConfig = {
    val conf = new SparkConf
    conf.setAppName("Test")
    conf.setMaster("local[1]")
    conf.set("spark.eventLog.enabled", "false")
    conf.set("mapreduce.fileoutputcommitter.marksuccessfuljobs", "false")

    conf.set("spark.eventLog.enabled", "true")
    conf.set("spark.eventLog.dir", "file:///D:/Workspace/spark-default-logs/logs")
    conf.set("spark.history.fs.logDirectory", "file:///D:/Workspace/spark-default-logs/logs")

    conf.set("spark.executor.instances","1")
    conf.set("spark.executor.cores","1")
    conf
  }
}
