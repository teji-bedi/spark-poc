package com.scala.learn.spark.datawriter.base

import org.apache.spark.sql.{DataFrame, SaveMode}

object HiveTableDataFrameWriter extends DataWriter {
  override def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite): Unit = {
    println(s"""In ParquetDataFrameWriter for data.write.mode($saveMode).insertInto($pathOrTableName)""")
//    data.write.mode(saveMode).insertInto(pathOrTableName)
  }
}
