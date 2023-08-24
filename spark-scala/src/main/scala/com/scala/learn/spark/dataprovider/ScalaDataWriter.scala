package com.scala.learn.spark.dataprovider

import com.scala.learn.spark.bo.ScalaBoPathProvider.OUTPUT_PATH.{CSV, PARQUET}
import com.scala.learn.spark.datawriter.base.{CsvDataFrameWriter, ParquetDataFrameWriter}
import org.apache.spark.sql.{DataFrame, SaveMode}


class ScalaDataWriter(val data: DataFrame, val dataOf: String, saveMode: SaveMode = SaveMode.Overwrite) {

  def write(format: String = "PARQUET"): Unit = {
    format.toLowerCase match {
      case "parquet" => writeParquet()
      case "csv" => writeCsv()
      case _ => throw new IllegalArgumentException("Illegal format provided")
    }
  }

  def writeParquet(): Unit = {
    val path = dataOf.toLowerCase match {
      case "movies" => PARQUET.MOVIES
      case "links" => PARQUET.LINKS
      case "rating" => PARQUET.RATINGS
      case "tags" => PARQUET.TAG
      case "genome-tags" => PARQUET.GENOME_TAG
      case "genome-scores" => PARQUET.GENOME_SCORE
      case _ => throw new IllegalArgumentException("Illegal bo provided")
    }
    ParquetWriter.writeData(path)
  }

  def writeCsv(): Unit = {
    val path = dataOf.toLowerCase match {
      case "movies" => CSV.MOVIES
      case "links" => CSV.LINKS
      case "rating" => CSV.RATINGS
      case "tags" => CSV.TAG
      case "genome-tags" => CSV.GENOME_TAG
      case "genome-scores" => CSV.GENOME_SCORE
      case _ => throw new IllegalArgumentException("Illegal bo provided")
    }
    CsvWriter.writeData(path)
  }

  private object ParquetWriter {
    def writeData(path: String): Unit = ParquetDataFrameWriter.writeData(data.toDF(), path, saveMode)
  }

  private object CsvWriter {
    def writeData(path: String): Unit = CsvDataFrameWriter.writeData(data.toDF(), path, saveMode)
  }
}
