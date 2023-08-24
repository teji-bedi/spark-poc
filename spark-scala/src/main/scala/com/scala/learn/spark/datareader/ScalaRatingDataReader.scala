package com.scala.learn.spark.datareader
import com.scala.learn.spark.bo.{ScalaBoPathProvider, ScalaLinkBo, ScalaRatingBo}
import com.scala.learn.spark.datareader.base.ScalaCsvDataReader
import org.apache.spark.sql.Dataset
class ScalaRatingDataReader extends ScalaCsvDataReader[ScalaRatingBo] {

  import spark.implicits._


  override def inputData: Dataset[ScalaRatingBo] = getData(ScalaBoPathProvider.INPUT_PATH.RATINGS)
    .map(row => ScalaRatingBo(
      movieId = row.getAs[Int]("movieId"),
      userId = row.getAs[Int]("userId"),
      rating = row.getAs[Int]("rating"),
      timestamp = row.getAs[String]("timestamp")
    )).as[ScalaRatingBo]
}
