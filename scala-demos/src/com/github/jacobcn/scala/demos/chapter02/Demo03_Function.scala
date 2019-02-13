package com.github.jacobcn.scala.demos.chapter02

object Demo03_Function extends App {
    //function: abstract
    println("- " * 10)

    def abs(x: Double) = if (x >= 0) x else -x

    for (i <- -2 to 2) print(f"|$i|=${abs(i).toInt}\t")
    println

    //function: fac
    println("- " * 10)

    def fac1(n: Int) = {
        var r = 1
        for (i <- 1 to n) r = r * i
        r
    }

    def fac2(n: Int): BigInt = {
        var r: BigInt = 1
        for (i <- 1 to n) r = r * i
        r
    }

    // recursive method needs result type
    def fac3(n: Int): Int = if (n <= 0) 1 else n * fac3(n - 1)

    println(fac1(10))
    println(fac2(50))
    println(fac3(10))

    // argument default values, parameters with name
    println("- " * 10)

    def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

    println(decorate("Hello1"))
    println(decorate("Hello2", "<"))
    println(decorate("Hello3", "<", ">"))
    println(decorate("Hello4", left = "<<"))
    println(decorate("Hello5", left = "<<", right = ">>"))
    println(decorate("Hello6", right = ">>+", left = "+<<"))
    println(decorate("Hello7", right = "++"))
    println(decorate(left = "{{{", str = "Hello8", right = "}}}"))


    //variable arguments
    println("- " * 10)

    def sum(args: Int*) = {
        var result = 0
        for (arg <- args) result += arg
        result
    }

    println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(sum(1 to 10: _*))

    def recursiveSum(args: Int*): Int = {
        if (args.length == 0) 0
        else args.head + recursiveSum(args.tail: _*)
    }

    println(recursiveSum(1 to 10: _*))

    // procedure
    println("-" * 10)
    def box1(s: String) {
        println("[" + s + "]")
    }

    def box2(s: String): Unit = {
        println("[[" + s + "]]")
    }

    box1("x")
    box2("y")
    println(box1("xx"))
    println(box2("yy"))
}
