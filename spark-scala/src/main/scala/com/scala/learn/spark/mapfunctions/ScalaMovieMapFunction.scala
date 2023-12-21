package com.scala.learn.spark.mapfunctions

import com.scala.learn.spark.bo.{ScalaLinkBo, ScalaMovieBo}
import org.apache.spark.api.java.function.MapFunction
class ScalaMovieMapFunction extends MapFunction[(ScalaMovieBo, ScalaLinkBo), ScalaMovieBo] {
  override def call(tuple: (ScalaMovieBo, ScalaLinkBo)): ScalaMovieBo = {
    println("--->" + tuple._1.copy())
    tuple._1
  }
}
