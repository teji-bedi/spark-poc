package com.scala.learn.spark.datareader

import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaGenomeTagBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset

class ScalaGenomeTagDataReader extends ScalaCsvDataReader[ScalaGenomeTagBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaGenomeTagBo] = getData(ScalaBoPathProvider.INPUT_PATH.GENOME_TAG)
    .map(row => ScalaGenomeTagBo(
      tag = row.getAs[String]("rating"),
      tagId = row.getAs[Int]("timestamp")
    )).as[ScalaGenomeTagBo]
}
