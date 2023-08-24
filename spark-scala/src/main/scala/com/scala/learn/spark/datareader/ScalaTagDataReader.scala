package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaRatingBo, ScalaTagBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaTagDataReader extends ScalaCsvDataReader[ScalaTagBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaTagBo] = getData(ScalaBoPathProvider.INPUT_PATH.TAG)
    .map(row => ScalaTagBo(
      movieId = row.getAs[Int]("movieId"),
      userId = row.getAs[Int]("userId"),
      tag = row.getAs[String]("rating"),
      timestamp = row.getAs[String]("timestamp")
    )).as[ScalaTagBo]
}

