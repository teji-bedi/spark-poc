package com.scala.learn.spark.bo

object ScalaBoPathProvider {
  object INPUT_PATH {
    object MOVIE_LENS {
      object CSV {
        val MOVIES = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\movies.csv"
        val LINKS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\links.csv"
        val RATINGS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\ratings.csv"
        val TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\tags.csv"
        val GENOME_TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\genome-tags.csv"
        val GENOME_SCORE = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\csv\\genome-scores.csv"
      }

      object PARQUET {
        val MOVIES = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\movies.csv"
        val LINKS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\links.csv"
        val RATINGS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\ratings.csv"
        val TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\tags.csv"
        val GENOME_TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\genome-tags.csv"
        val GENOME_SCORE = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\movielens\\parquet\\genome-scores.csv"
      }
    }

    object DUMMY {
      val DEMO_DATA = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\dummy\\demo-data.csv"
    }

    object FLIGHT {
      val FLIGHT_DATA = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\input\\flights\\Flights-1m.parquet"
    }
  }

  object OUTPUT_PATH {
    object MOVIE_LENS {
      object PARQUET {
        val MOVIES = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\movies"
        val LINKS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\links"
        val RATINGS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\ratings"
        val TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\tags"
        val GENOME_TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\genome-tags"
        val GENOME_SCORE = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\parquet\\genome-scores"
      }

      object CSV {
        val MOVIES = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\movies"
        val LINKS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\links"
        val RATINGS = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\ratings"
        val TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\tags"
        val GENOME_TAG = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\genome-tags"
        val GENOME_SCORE = "D:\\Workspace\\codebase\\github\\spark-poc\\data\\output\\movielens\\csv\\genome-scores"
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
}
