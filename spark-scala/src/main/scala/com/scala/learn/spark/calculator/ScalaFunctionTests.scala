package com.scala.learn.spark.calculator

import com.scala.learn.spark.base.ScalaSparkSessionProvider

object ScalaFunctionTests  extends ScalaSparkSessionProvider {
  def main(args: Array[String]): Unit = {
    val rdd1 = spark.sparkContext.parallelize(List(1, 2, 3, 4, 6,7), 2)
    rdd1.foreachPartition(a => {
      a.foreach(b => print(b))
      println("--")
    })
    val result: Int = rdd1.fold(5) { (acc1, acc2) =>
      val sum = acc1 + acc2
      println(s"Fold: acc1($acc1) + acc2($acc2) = $sum")
      sum
    }
    println(result)


    val a = List(1,2,3)
    (a:+ 4).foreach(v => println(v))
  }
}




// 5 + 2,3,
