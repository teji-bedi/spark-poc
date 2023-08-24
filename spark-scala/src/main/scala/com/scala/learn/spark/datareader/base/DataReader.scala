package com.scala.learn.spark.datareader.base

import com.scala.learn.spark.base.ScalaSparkSessionProvider
import org.apache.spark.sql.{DataFrameReader, Dataset, Row};

abstract class DataReader extends ScalaSparkSessionProvider {

  val dataFrameReader: DataFrameReader = spark.read.option("header", "true").option("inferSchema", "true")

  def getData(path: String): Dataset[Row]
}
