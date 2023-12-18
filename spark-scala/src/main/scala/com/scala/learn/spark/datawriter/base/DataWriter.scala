package com.scala.learn.spark.datawriter.base

import org.apache.spark.sql.{DataFrame, SaveMode}

trait DataWriter {
  def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite, partitionedColumn: List[String]): Unit
}
