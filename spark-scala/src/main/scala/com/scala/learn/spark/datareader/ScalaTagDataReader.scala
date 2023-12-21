package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.PARQUET._
import com.scala.learn.spark.bo.ScalaTagBo
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaTagDataReader extends ScalaCsvDataReader[ScalaTagBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaTagBo] = getData(TAG)
    .map(row => ScalaTagBo(
      userId = row.getAs[Int]("userId"),
      movieId = row.getAs[Int]("movieId"),
      tag = row.getAs[String]("tag"),
      timestamp = row.getAs[String]("timestamp")
    )).as[ScalaTagBo]
}

