package com.scala.learn.spark.bo;

import lombok.{AllArgsConstructor, Builder, Data, NoArgsConstructor};

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
case class ScalaRatingBo(userId: Int, movieId: Int, rating: Double, timestamp: String)
