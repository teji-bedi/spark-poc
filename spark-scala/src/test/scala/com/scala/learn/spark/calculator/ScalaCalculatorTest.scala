package com.scala.learn.spark.calculator

import com.scala.learn.spark.bo._
import com.scala.learn.spark.dataprovider.{ScalaDataProvider, ScalaDataWriter}
import org.apache.spark.sql.SparkSession
import org.mockito.ArgumentMatchers._
import org.mockito.{InjectMocks, MockitoSugar}
import org.scalatest.flatspec.AnyFlatSpec

class ScalaCalculatorTest extends AnyFlatSpec with MockitoSugar {
//  val spark = SparkSession.builder
//    .master("local[*]")
//    .getOrCreate()
//
//  import spark.implicits._


  it should ("work") in {
//    val scalaDataProvider = mock[ScalaDataProvider]
//    val scalaDataWriter = mock[ScalaDataWriter]
//    val dataFrameReader = spark.read.option("header", "true").option("inferSchema", "true").option("delimiter", ",")
//    val moviesDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\movies.csv").as[ScalaMovieBo]
//    val linksDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\links.csv").as[ScalaLinkBo]
//    val ratingsDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\ratings.csv").as[ScalaRatingBo]
//    val tagsDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\tags.csv").as[ScalaTagBo]
//    val genomeTagsDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\genome-tags.csv").as[ScalaGenomeTagBo]
//    val genomeScoresDf = dataFrameReader.csv("D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\genome-scores.csv").as[ScalaGenomeScoreBo]
//
//
//    when(scalaDataProvider.getMovies).thenReturn(moviesDf)
//    when(scalaDataProvider.getLinks).thenReturn(linksDf)
//    when(scalaDataProvider.getRatings).thenReturn(ratingsDf)
//    when(scalaDataProvider.getTags).thenReturn(tagsDf)
//    when(scalaDataProvider.getGenomeTags).thenReturn(genomeTagsDf)
//    when(scalaDataProvider.getGenomeScores).thenReturn(genomeScoresDf)

//    doNothing.when(scalaDataWriter).write(anyString())
//    doNothing.when(scalaDataWriter).writeParquet()
//    doNothing.when(scalaDataWriter).writeCsv()

//    val m = mock[Parent]
//    val m1 = InjectMocks[Parent]
//    ScalaCalculator.main(Array(""))


//    when(m.printMessage()).thenCallRealMethod()
//    doNothing.when(m).printMessage()

  }
}
