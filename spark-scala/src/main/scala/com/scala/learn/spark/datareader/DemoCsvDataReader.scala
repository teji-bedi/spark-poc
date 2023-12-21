package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.DUMMY.DEMO_DATA
import com.scala.learn.spark.datareader.base.ScalaDemoCsvDataFrameReader
import org.apache.spark.sql.DataFrame

class DemoCsvDataReader extends ScalaDemoCsvDataFrameReader {
  override def inputData: DataFrame = getData(DEMO_DATA)
}