package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.CSV.MOVIES
import com.scala.learn.spark.bo.ScalaMovieBo
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaMovieDataReader extends ScalaCsvDataReader[ScalaMovieBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaMovieBo] = getData(MOVIES)
    .map(row => ScalaMovieBo(
      movieId = row.getAs[Int]("movieId"),
      title = row.getAs("title"),
      genres = row.getAs("genres")
    )).as[ScalaMovieBo]
}
