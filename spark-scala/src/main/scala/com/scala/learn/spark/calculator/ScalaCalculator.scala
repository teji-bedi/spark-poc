package com.scala.learn.spark.calculator

import com.scala.learn.spark.base.ScalaSparkSessionProvider
import com.scala.learn.spark.bo._
import com.scala.learn.spark.dataprovider.{ScalaDataProvider, ScalaDataWriter}
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{col, desc, rank}
import org.apache.spark.sql.{DataFrame, Dataset, SaveMode}

object ScalaCalculator extends ScalaSparkSessionProvider {
  val dataProvider: ScalaDataProvider = new ScalaDataProvider

  import spark.sqlContext.implicits._

  def main(args: Array[String]): Unit = {
    val movies: Dataset[ScalaMovieBo] = dataProvider.getMovies
    val ratings: Dataset[ScalaRatingBo] = dataProvider.getRatings

    showHashPartitionAndHashExchangeAggregate()

    //    val d = movies.joinWith(ratings, ratings.col("movieId").equalTo(movies.col("movieId")), "inner")
    //      //.groupBy("_1.movieId").agg(collect_set("_2.userId"))
    //      println(d.queryExecution.toString())
    //      d.show()

    //    println(s"""---------------->${movies.count()}""")


    //movies.groupBy("genres").agg(collect_list("movieId")).show(false) //Single collect_list
    //    movies.groupBy("genres").agg(collect_list(struct($"movieId", $"title")).as("movie_details")).show(false) //multiple collect_list
  }

  def printSecondHighestSalary(employeeDf: DataFrame): Unit = {

    employeeDf.filter(col("deptname") === "BI and BD")
      .withColumn("rk", rank().over(Window.partitionBy(col("deptname")).orderBy(desc("salary"))))
      .filter(col("rk") === "2").show()

  }

  def operateOnDf(): Unit = {
    val movies: Dataset[ScalaMovieBo] = dataProvider.getMovies
    val links: Dataset[ScalaLinkBo] = dataProvider.getLinks
    val tags: Dataset[ScalaTagBo] = dataProvider.getTags
    val ratings: Dataset[ScalaRatingBo] = dataProvider.getRatings
    val genomeTags: Dataset[ScalaGenomeTagBo] = dataProvider.getGenomeTags
    val genomeScores: Dataset[ScalaGenomeScoreBo] = dataProvider.getGenomeScores
    val demoData: DataFrame = dataProvider.getDemoData
    val flightData: DataFrame = dataProvider.getFlightData

    //        val moviesJoinedWithLinks: Dataset[(ScalaMovieBo, ScalaLinkBo)] =
    //          movies.joinWith(links, movies.col("movieId").equalTo(links.col("movieId")), "inner")
    //            .filter(col("_1").isNotNull)
    //
    ////            .as(Tuple2(bean(classOf[ScalaMovieBo]), bean(classOf[ScalaLinkBo])))
    //
    //        val moviesDataAfterJoin: Dataset[ScalaMovieBo] = moviesJoinedWithLinks
    //          .select(moviesJoinedWithLinks.col("_1"))
    //          .map(new RowToScalaMovieBo(), Encoders.product[ScalaMovieBo])
    //
    //
    //        moviesJoinedWithLinks.show(5, truncate = false)
    //        moviesDataAfterJoin.show(10, truncate = false)
    //        println("source joined =========")
    //
    //        moviesJoinedWithLinks
    //          .filter(moviesJoinedWithLinks.col("_1").isNotNull)
    //          .select(moviesJoinedWithLinks.col("_1"))
    //          .printSchema()
    //
    new ScalaDataWriter(movies.toDF(), "movies", SaveMode.Overwrite).write()
    new ScalaDataWriter(links.toDF(), "links", SaveMode.Overwrite).write()
    new ScalaDataWriter(tags.toDF(), "tags", SaveMode.Overwrite).write()
    new ScalaDataWriter(ratings.toDF(), "rating", SaveMode.Overwrite).write()
    new ScalaDataWriter(genomeTags.toDF(), "genome-tags", SaveMode.Overwrite).write()
    new ScalaDataWriter(genomeScores.toDF(), "genome-scores", SaveMode.Overwrite).write()
    //
    //    demoData.show()
    //    printSecondHighestSalary(demoData)
    //    flightData.show(5, false)

    //    Thread.sleep(Long.MaxValue)
  }

  def showHashPartitionAndHashExchangeAggregate(): Unit = {
    dataProvider.getMovies.groupByKey(row => row.genres).count().show()
    //    dataProvider.getMovies.groupBy($"genres").count().show()
  }
}