package com.scala.learn.spark.datareader.base

import org.apache.spark.sql.DataFrame

abstract class ScalaDemoParquetDataFrameReader extends DataReader {
  override def getData(path: String): DataFrame = dataFrameReader.parquet(path)

  def inputData: DataFrame
}
