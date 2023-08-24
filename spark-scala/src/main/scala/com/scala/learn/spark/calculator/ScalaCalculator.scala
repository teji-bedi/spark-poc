package com.scala.learn.spark.calculator

import com.scala.learn.spark.bo._
import com.scala.learn.spark.dataprovider.{ScalaDataProvider, ScalaDataWriter}
import com.scala.learn.spark.mapfunctions.RowToScalaMovieBo
import org.apache.spark.sql.Encoders.{bean, tuple}
import org.apache.spark.sql.SaveMode._
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{Dataset, Encoders}

object ScalaCalculator {
  val dataProvider: ScalaDataProvider = new ScalaDataProvider

  def main(args: Array[String]): Unit = {

    val movies: Dataset[ScalaMovieBo] = dataProvider.getMovies
    val links: Dataset[ScalaLinkBo] = dataProvider.getLinks
    val tags: Dataset[ScalaTagBo] = dataProvider.getTags
    val ratings: Dataset[ScalaRatingBo] = dataProvider.getRatings
    val genomeTags: Dataset[ScalaGenomeTagBo] = dataProvider.getGenomeTags
    val genomeScores: Dataset[ScalaGenomeScoreBo] = dataProvider.getGenomeScores

    val moviesJoinedWithLinks: Dataset[(ScalaMovieBo, ScalaLinkBo)] =
      movies.joinWith(links, movies.col("movieId").equalTo(links.col("movieId")), "inner")
        .filter(col("_1").isNotNull)
        .as(tuple(bean(classOf[ScalaMovieBo]), bean(classOf[ScalaLinkBo])))

    val moviesDataAfterJoin: Dataset[ScalaMovieBo] = moviesJoinedWithLinks
      .select(moviesJoinedWithLinks.col("_1"))
      .map(new RowToScalaMovieBo(), Encoders.product[ScalaMovieBo])


    moviesJoinedWithLinks.show(5, truncate = false)
    moviesDataAfterJoin.show(10, truncate = false)
    println("source joined =========")

    moviesJoinedWithLinks
      .filter(moviesJoinedWithLinks.col("_1").isNotNull)
      .select(moviesJoinedWithLinks.col("_1"))
      .printSchema()

    new ScalaDataWriter(moviesDataAfterJoin.toDF(), "movies", Overwrite).write()
  }
}
