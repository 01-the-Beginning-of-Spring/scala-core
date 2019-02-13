package com.github.jacobcn.scala.demos.chapter02

object Demo04_LazyValue extends App {
    val notLazy = io.Source.fromFile("hello.xyz").mkString // will throw FileNotFoundException
    lazy val lazyValue = io.Source.fromFile("hello.xyz").mkString
    println(lazyValue) // will throw FileNotFoundException
}
