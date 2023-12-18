package com.scala.learn.spark.bo;;

case class ScalaLinkBo(movieId: Int = 0, imdbId: Int = 0, tmdbId: Int = 0) {
  def this() = {
    this(0, 0, 0)
  }
}
