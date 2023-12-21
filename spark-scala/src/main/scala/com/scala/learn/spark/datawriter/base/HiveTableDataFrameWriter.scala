package com.scala.learn.spark.datawriter.base

import org.apache.spark.sql.{DataFrame, SaveMode}

object HiveTableDataFrameWriter extends DataWriter {
  override def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite, partitionedColumn: List[String]): Unit = {
    println(s"""In ParquetDataFrameWriter for data.write.mode($saveMode).insertInto($pathOrTableName)""")
    if (partitionedColumn.isEmpty)
      data.write.mode(saveMode).parquet(pathOrTableName)
    else
      data.write.partitionBy(partitionedColumn: _*).mode(saveMode).parquet(pathOrTableName)
  }
}
