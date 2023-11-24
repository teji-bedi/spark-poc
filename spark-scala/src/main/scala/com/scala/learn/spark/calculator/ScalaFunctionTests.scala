package com.scala.learn.spark.calculator

import com.scala.learn.spark.base.ScalaSparkSessionProvider

sealed class DevOps
class Developer extends DevOps{
  def print(): Unit = println("Developer")
}
class Engineer  extends DevOps{
  def print(): Unit = println("Engineer")
}


object ScalaFunctionTests {
  val e: Engineer = new Engineer
  e.print


  def main(args: Array[String]): Unit = {

  }

}



// 5 + 2,3,



