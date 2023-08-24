package com.scala.learn.spark.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
case class ScalaGenomeScoreBo(movieId: Int, tagId: Int, relevance: Double)