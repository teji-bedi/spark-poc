package com.scala.learn.spark.bo;

import lombok.{AllArgsConstructor, Builder, Data, NoArgsConstructor};

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
case class ScalaGenomeTagBo(tagId: Int, tag: String)