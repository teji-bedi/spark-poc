package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaMovieBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaMovieDataReader extends ScalaCsvDataReader[ScalaMovieBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaMovieBo] = getData(ScalaBoPathProvider.INPUT_PATH.MOVIES)
    .map(row => ScalaMovieBo(
      movieId = row.getAs[Int]("movieId"),
      title = row.getAs("title"),
      genres = row.getAs("genres")
    )).as[ScalaMovieBo]
}
