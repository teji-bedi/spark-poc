package com.scala.learn.spark.datareader.base

import org.apache.spark.sql.{DataFrame, Dataset, Row}

abstract class ScalaDemoCsvDataFrameReader extends DataReader {
  override def getData(path: String): DataFrame = dataFrameReader.option("delimiter", ",").csv(path)

  def inputData: DataFrame
}
