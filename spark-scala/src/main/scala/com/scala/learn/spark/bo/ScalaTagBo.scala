package com.scala.learn.spark.bo

import lombok.{AllArgsConstructor, Builder, Data, NoArgsConstructor}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
case class ScalaTagBo(userId: Int, movieId: Int, tag: String, timestamp: String)
