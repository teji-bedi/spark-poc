package com.scala.learn.spark.bo

import lombok.{AllArgsConstructor, Data, Getter, NoArgsConstructor, Setter}

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
case class ScalaMovieBo(var movieId: Integer = 0, var title: String = "", var genres: String = "") {
  def this() = {
    this(0, "", "")
  }
}
