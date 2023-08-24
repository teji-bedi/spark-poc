package com.scala.learn.spark.datareader.base

import org.apache.spark.sql.{Dataset, Row}

abstract class ScalaCsvDataReader[T] extends DataReader {
  override def getData(path: String): Dataset[Row] = dataFrameReader.option("delimiter", ",").csv(path)

  def inputData: Dataset[T]
}
