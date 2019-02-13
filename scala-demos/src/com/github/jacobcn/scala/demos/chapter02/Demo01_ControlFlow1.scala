package com.github.jacobcn.scala.demos.chapter02

object Demo01_ControlFlow1 extends App {
    //1 if-else
    println("-" * 10)
    var x = 1
    val y = if (x > 0) 100 else -100
    println(y)
    println(y.getClass.getSimpleName)
    var z = 0
    if (x > 0) z = 1000 else z = -1000
    println(z)
    val mix = if (x < 0) 1 else "str"
    println(mix)
    println(mix.getClass.getSimpleName)
    val a = if (x < 0) "[str-if]"
    println(a)
    println(a.getClass.getSimpleName)
    val b = if (x < 0) "[str-if]" else ()
    println(b)

    //2
    println("-" * 10)
    val x1 = 1; val y1 = 1
    val x2 = 1; val y2 = 4
    val distance = {
        val dx = x2 - x1; val dy = y2 -
            y1
        math.sqrt(dx * dx + dy * dy)
    }.toInt
    println(distance)
    val dist = { var dx = x2-x1; val dy = y2-y1 }
    println(dist)

    //3, output
    println("-" * 10)
    print("Ans -> ")
    println("Hello")
    printf("%s -> %d%n", "Ans", 123)
    val m1 = 1
    var m2 = 20
    val str = "some-string"
    print(f"$str -- $m1%2d + $m2 = ${m1 + m2}%-2d%n")
    println(f"$str -- $m1%2d + $m2 = ${m1 + m2}%-2d%n")
    printf(f"$str -- $m1%2d + $m2 = ${m1 + m2}%-2d%n")

    print(raw"[\n\n\n]")
    print(s"[\n($$)$str -- $m1 + $m2 = ${m1 + m2}\n%n]")

    //4, input
    println("-" * 10)
    val inputStr = io.StdIn.readLine("Please input some string: ")
    print("please input a int: ")
    val inputInt = io.StdIn.readInt()
    println(f"your input string is [${inputStr}]")
    println(f"your input integer is [${inputInt}]")


}
