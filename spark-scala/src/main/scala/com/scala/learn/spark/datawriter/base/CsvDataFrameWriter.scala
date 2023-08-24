package com.scala.learn.spark.datawriter.base

import org.apache.spark.sql.{DataFrame, SaveMode}

object CsvDataFrameWriter extends DataWriter {
  override def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite): Unit = {
    println(s"""In CsvDataFrameWriter for data.write.mode($saveMode).csv($pathOrTableName)""")
//    data.write.mode(saveMode).csv(pathOrTableName)
  }
}
