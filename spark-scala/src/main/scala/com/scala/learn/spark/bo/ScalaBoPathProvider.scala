package com.scala.learn.spark.bo

object ScalaBoPathProvider {
  object INPUT_PATH {
    val MOVIES  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\movies.csv"
    val LINKS  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\links.csv"
    val RATINGS  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\ratings.csv"
    val TAG  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\tags.csv"
    val GENOME_TAG  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\genome-tags.csv"
    val GENOME_SCORE  = "D:\\Workspace\\codebase\\spark-poc\\data\\input\\movielens\\genome-scores.csv"
  }

  object OUTPUT_PATH {

    object PARQUET {
      val MOVIES = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\movies"
      val LINKS = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\links"
      val RATINGS = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\ratings"
      val TAG = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\tags"
      val GENOME_TAG = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\genome-tags"
      val GENOME_SCORE = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\parquet\\genome-scores"
    }
    object CSV {
      val MOVIES = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\movies"
      val LINKS = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\links"
      val RATINGS = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\ratings"
      val TAG = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\tags"
      val GENOME_TAG = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\genome-tags"
      val GENOME_SCORE = "D:\\Workspace\\codebase\\spark-poc\\data\\output\\movielens\\csv\\genome-scores"
    }
    object HIVE {
      val MOVIES = "movies"
      val LINKS = "links"
      val RATINGS = "ratings"
      val TAG = "tags"
      val GENOME_TAG = "genome_tags"
      val GENOME_SCORE = "genome_scores"
    }
  }

}
