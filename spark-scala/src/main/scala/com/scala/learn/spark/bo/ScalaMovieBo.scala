package com.scala.learn.spark.bo
case class ScalaMovieBo(var movieId: Integer = 0, var title: String = "", var genres: String = "") {
  def this() = {
    this(0, "", "")
  }
}
