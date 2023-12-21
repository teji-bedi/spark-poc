package com.scala.learn.spark.mapfunctions

import com.scala.learn.spark.bo.ScalaMovieBo
import org.apache.spark.api.java.function.MapFunction
import org.apache.spark.sql.Row
import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema

class RowToScalaMovieBo extends MapFunction[Row, ScalaMovieBo] {
  override def call(row: Row): ScalaMovieBo = {
    val g: GenericRowWithSchema = row.get(0).asInstanceOf[GenericRowWithSchema]
    ScalaMovieBo(
      movieId = g.getInt(g.fieldIndex("movieId")),
      title = g.getString(g.fieldIndex("title")),
      genres = g.getString(g.fieldIndex("genres"))
    )
  }
}
