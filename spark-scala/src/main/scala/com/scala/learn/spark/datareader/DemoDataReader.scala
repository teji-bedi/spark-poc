package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider
import com.scala.learn.spark.datareader.base.ScalaDemoDataFrameReader
import org.apache.spark.sql.DataFrame

class DemoDataReader extends ScalaDemoDataFrameReader {
  override def inputData: DataFrame = getData(ScalaBoPathProvider.INPUT_PATH.DEMO_DATA)
}