package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaGenomeScoreBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaGenomeScoreDataReader extends ScalaCsvDataReader[ScalaGenomeScoreBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaGenomeScoreBo] = getData(ScalaBoPathProvider.INPUT_PATH.GENOME_SCORE)
    .map(
      row => ScalaGenomeScoreBo(
      movieId = row.getAs[Int]("rating"),
      tagId = row.getAs[Int]("timestamp"),
      relevance = row.getAs[Double]("relevance")
    )).as[ScalaGenomeScoreBo]
}
