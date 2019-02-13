package com.github.jacobcn.scala.demos.chapter01

import scala.math._

object Demo01_HelloWorld extends App {
    //1
    println("-"*10)
    val str = "Hello Scala World!"
    println(str)

    //2
    println("-"*10)
    val str2 = str * 2
    for (s <- 0 to str2.length - 1) {
        print(str2(s) + "|")
    }
    println()

    //3
    println("-"*10)
    val comInt = pow(2, 10).toInt
    println(comInt)

    // 4
    println("-" * 10)
    val longStr =
        """
          |++++++++++++
          |First Line
          |Second Line
          |++++++++++++
        """.stripMargin

    println(longStr)

    //5 static function for java calling
    def say(sb:String)={
        f"Hello ${sb}, welcome to our scala world!"
    }
    println(say("Jacob"))

}
