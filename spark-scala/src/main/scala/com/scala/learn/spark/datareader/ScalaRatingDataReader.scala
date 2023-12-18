package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.CSV._
import com.scala.learn.spark.bo.ScalaRatingBo
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaRatingDataReader extends ScalaCsvDataReader[ScalaRatingBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaRatingBo] = getData(RATINGS)
    .map(row => ScalaRatingBo(
      userId = row.getAs[Int]("userId"),
      movieId = row.getAs[Int]("movieId"),
      rating = row.getAs[Double]("rating"),
      timestamp = row.getAs[Int]("timestamp").toString
    )).as[ScalaRatingBo]
}
