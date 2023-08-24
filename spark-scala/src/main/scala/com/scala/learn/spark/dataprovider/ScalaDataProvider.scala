package com.scala.learn.spark.dataprovider

import com.scala.learn.spark.bo._
import com.scala.learn.spark.datareader._
import org.apache.spark.sql.Dataset

class ScalaDataProvider {

  def getMovies: Dataset[ScalaMovieBo] = new ScalaMovieDataReader().inputData

  def getLinks: Dataset[ScalaLinkBo] = new ScalaLinkDataReader().inputData

  def getTags: Dataset[ScalaTagBo] = new ScalaTagDataReader().inputData

  def getRatings: Dataset[ScalaRatingBo] = new ScalaRatingDataReader().inputData

  def getGenomeTags: Dataset[ScalaGenomeTagBo] = new ScalaGenomeTagDataReader().inputData

  def getGenomeScores: Dataset[ScalaGenomeScoreBo] = new ScalaGenomeScoreDataReader().inputData
}
