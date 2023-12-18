package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.PARQUET._
import com.scala.learn.spark.bo.ScalaGenomeScoreBo
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaGenomeScoreDataReader extends ScalaCsvDataReader[ScalaGenomeScoreBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaGenomeScoreBo] = getData(GENOME_SCORE)
    .map(
      row => ScalaGenomeScoreBo(
        movieId = row.getAs[Int]("movieId"),
        tagId = row.getAs[Int]("tagId"),
        relevance = row.getAs[Double]("relevance")
      )).as[ScalaGenomeScoreBo]
}
