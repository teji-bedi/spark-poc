package com.scala.learn.spark.datawriter.base
import org.apache.spark.sql.{DataFrame, SaveMode}

object ParquetDataFrameWriter extends DataWriter {
  override def writeData(data: DataFrame, pathOrTableName: String, saveMode: SaveMode = SaveMode.Overwrite): Unit = {
    println(s"""In ParquetDataFrameWriter for dataFrame.write.mode($saveMode).parquet($pathOrTableName)""")
//    dataFrame.write.mode(saveMode).parquet(pathOrTableName)
  }
}
