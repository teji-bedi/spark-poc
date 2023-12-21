package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaLinkBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset
import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.PARQUET._

class ScalaLinkDataReader extends ScalaCsvDataReader[ScalaLinkBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaLinkBo] = getData(LINKS)
    .map(row => ScalaLinkBo(
      movieId = row.getAs[Int]("movieId"),
      imdbId = row.getAs("imdbId"),
      tmdbId = row.getAs("tmdbId")
    )).as[ScalaLinkBo]
}
