package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider
import com.scala.learn.spark.datareader.base.ScalaDemoParquetDataFrameReader
import org.apache.spark.sql.DataFrame
import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.FLIGHT.FLIGHT_DATA

class DemoParquetDataReader extends ScalaDemoParquetDataFrameReader {
  override def inputData: DataFrame = getData(FLIGHT_DATA)
}