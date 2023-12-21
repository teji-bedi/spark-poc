package com.scala.learn.spark.dataprovider

import com.scala.learn.spark.bo.ScalaBoPathProvider.OUTPUT_PATH.MOVIE_LENS.{CSV, HIVE, PARQUET}
import com.scala.learn.spark.datawriter.base.{CsvDataFrameWriter, HiveTableDataFrameWriter, ParquetDataFrameWriter}
import org.apache.spark.sql.{DataFrame, SaveMode}


class ScalaDataWriter(val data: DataFrame, val dataOf: String, saveMode: SaveMode = SaveMode.Overwrite, partitionedColumn: List[String] = List.empty) {

  def write(format: String = "PARQUET"): Unit = {
    format.toLowerCase match {
      case "parquet" => writeParquet(partitionedColumn)
      case "csv" => writeCsv(partitionedColumn)
      case "hive" => writeHive(partitionedColumn)
      case _ => throw new IllegalArgumentException("Illegal format provided")
    }
  }

  def writeParquet(partitionedColumn: List[String]): Unit = {
    val path = dataOf.toLowerCase match {
      case "movies" => PARQUET.MOVIES
      case "links" => PARQUET.LINKS
      case "rating" => PARQUET.RATINGS
      case "tags" => PARQUET.TAG
      case "genome-tags" => PARQUET.GENOME_TAG
      case "genome-scores" => PARQUET.GENOME_SCORE
      case _ => throw new IllegalArgumentException("Illegal bo provided")
    }
    ParquetWriter.writeData(path, partitionedColumn)
  }

  def writeCsv(partitionedColumn: List[String]): Unit = {
    val path = dataOf.toLowerCase match {
      case "movies" => CSV.MOVIES
      case "links" => CSV.LINKS
      case "rating" => CSV.RATINGS
      case "tags" => CSV.TAG
      case "genome-tags" => CSV.GENOME_TAG
      case "genome-scores" => CSV.GENOME_SCORE
      case _ => throw new IllegalArgumentException("Illegal bo provided")
    }
    CsvWriter.writeData(path, partitionedColumn)
  }

  def writeHive(partitionedColumn: List[String]): Unit = {
    val path = dataOf.toLowerCase match {
      case "movies" => HIVE.MOVIES
      case "links" => HIVE.LINKS
      case "rating" => HIVE.RATINGS
      case "tags" => HIVE.TAG
      case "genome-tags" => HIVE.GENOME_TAG
      case "genome-scores" => HIVE.GENOME_SCORE
      case _ => throw new IllegalArgumentException("Illegal bo provided")
    }
    CsvWriter.writeData(path, partitionedColumn)
  }

  private object ParquetWriter {
    def writeData(path: String, partitionedColumns: List[String]): Unit = ParquetDataFrameWriter.writeData(data.toDF(), path, saveMode, partitionedColumns)
  }

  private object CsvWriter {
    def writeData(path: String, partitionedColumns: List[String]): Unit = CsvDataFrameWriter.writeData(data.toDF(), path, saveMode, partitionedColumns)
  }

  private object HiveTableWriter {
    def writeData(path: String, partitionedColumns: List[String]): Unit = HiveTableDataFrameWriter.writeData(data.toDF(), path, saveMode, partitionedColumns)
  }
}
