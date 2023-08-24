package com.scala.learn.spark.bo;

import lombok.{AllArgsConstructor, Builder, Data, NoArgsConstructor};

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
case class ScalaLinkBo(movieId: Int = 0, imdbId: Int = 0, tmdbId: Int = 0) {
  def this() = {
    this(0, 0, 0)
  }
}
