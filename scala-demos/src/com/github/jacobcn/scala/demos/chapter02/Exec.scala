package com.github.jacobcn.scala.demos.chapter02

import java.time.LocalDate

object Exec extends App {
    // exercise 1
    println("-" * 10)
    println("exercise 1")

    def signum(n: Long): Int = {
        if (n == 0) 0
        else if (n > 0) 1
        else -1
    }

    printf("signum(-10)=%d, signum(0)=%d, signum(10)=%d%n", signum(-10), signum(0), signum(10))

    //exercise 2
    println("-" * 10)
    println("exercise 2")
    val blockValue: Unit = {}
    println(blockValue)
    println(x.isInstanceOf[Unit])

    //exercise 3
    println("-" * 10)
    println("exercise 3")
    var y = 2
    val x: Unit = y = 1
    println(x)
    println(x.isInstanceOf[Unit])

    //exercise 4
    println("-" * 10)
    println("exercise 4")
    for (i <- (0 to 10).reverse) println(i)

    //exercise 5
    println("-" * 10)
    println("exercise 5")

    def countdown(n: Int): Unit = for (i <- (0 to n).reverse) println(i)

    countdown(10)

    //exercise 6
    println("-" * 10)
    println("exercise 6")

    def cal_unicode1(str: String): Long = {
        var cj: Long = 1
        for (s <- str) cj *= s.toLong
        cj
    }

    println(cal_unicode1("Hello"))

    // exercise 7
    println("-" * 10)
    println("exercise 7")

    def cal_unicode2(str: String): Long = {
        str.foldLeft(1L)(_ * _.toInt)
    }

    println(cal_unicode2("Hello"))

    // exercise 8
    println("-" * 10)
    println("exercise 8")

    def product(s: String): Long = {
        s.foldLeft(1L)(_ * _)
    }

    println(product("Hello"))

    // exercise 9
    println("-" * 10)
    println("exercise 9")

    def product2(s: String): Long = {
        if (s.length == 0) 1L
        else s.head.toLong * product2(s.tail)
    }

    println(product2("Hello"))

    // exercise 10
    println("-" * 10)
    println("exercise 10")

    def fun(x: Double, n: Int): Double = {
        if (n < 0) {
            1 / fun(x, -n)
        } else if (n == 0)
            1
        else if (n % 2 == 0) {
            val y = math.pow(x, n / 2)
            y * y
        } else {
            x * fun(x, n - 1)
        }
    }

    println(fun(10, -1))
    println(fun(20, 0))
    println(fun(10, 1))
    println(fun(10, 2))

    // exercise 11
    println("-" * 10)
    println("exercise 11")

    val e1 = "Your input must seperated by '-'"
    val e2 = "You must input 3 arguments."
    val e3 = "Your inputs must int type."

    implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
        def date(args: Any*): LocalDate = {
            if (sc.parts(1) != "-" && sc.parts != "-") {
                throw new IllegalArgumentException(e1)
            }
            if (args.length != 3) {
                throw new IllegalArgumentException(e2)
            }
            if (!args(0).isInstanceOf[Int] && !args(1).isInstanceOf[Int] && !args(2).isInstanceOf[Int]) {
                throw new IllegalArgumentException()
            }
            LocalDate.of(args(0).toString.toInt, args(1).toString.toInt, args(2).toString.toInt)
        }
    }

    val year = 2018
    val month = 8
    val day = 25
    var localDate: LocalDate = date"$year-$month-$day"
    println(localDate)
    println(localDate.isInstanceOf[LocalDate])
    try {
        date"$year$month,$day"
    } catch {
        case e: IllegalArgumentException => println(e.getMessage.equals(e1))
    }
    try {
        date"$year-$month"
    } catch {
        case e: IllegalArgumentException => println(e.getMessage.equals(e2))
    }
    try {
        date"$year-$month-[$day]"
    } catch {
        case e: IllegalArgumentException => println(e.getMessage.equals(e3))
    }

}
