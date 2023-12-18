package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaGenomeTagBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset
import com.scala.learn.spark.bo.ScalaBoPathProvider.INPUT_PATH.MOVIE_LENS.PARQUET._

class ScalaGenomeTagDataReader extends ScalaCsvDataReader[ScalaGenomeTagBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaGenomeTagBo] = getData(GENOME_TAG)
    .map(row => ScalaGenomeTagBo(
      tagId = row.getAs[Int]("tagId"),
      tag = row.getAs[String]("tag")
    )).as[ScalaGenomeTagBo]
}
