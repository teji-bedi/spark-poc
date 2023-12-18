package com.scala.learn.spark.datawriter.base

import org.apache.spark.sql.{DataFrame, SaveMode}

object ParquetDataFrameWriter extends DataWriter {
  override def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite, partitionedColumn: List[String]): Unit = {
    println(s"""In ParquetDataFrameWriter for dataFrame.write.mode($saveMode).parquet($pathOrTableName)""")
    if (partitionedColumn.isEmpty)
      data.coalesce(1).write.mode(saveMode).parquet(pathOrTableName)
    else
      data.coalesce(1).write.partitionBy(partitionedColumn: _*).mode(saveMode).parquet(pathOrTableName)
  }
}
