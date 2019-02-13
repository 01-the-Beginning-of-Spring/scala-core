package com.github.jacobcn.scala.demos.chapter02

object Demo02_ControlFlow2 extends App {

    //loop - for
    var sum = 0
    for (i <- 1 to 10) {
        sum += i
    }
    printf("sum from %d to %d = %d%n", 1, 10, sum)

    //loop - while
    sum = 0
    var i = 0
    while (i <= 10) {
        sum += i
        i += 1
    }
    printf("sum from %d to %d = %d%n", 1, 10, sum)

    // loop - string
    val str = "Hello world!"
    for (c <- str) print(c + "-")
    println()
    for (c <- 0 to str.length() - 1) {
        print(str.charAt(c))
        print(str(c))
        print(".")
    }
    println()

    // loop - do-while
    i = 0
    sum = 0
    do {
        sum += i
        i += 1
    } while (i <= 10)
    printf("sum from %d to %d = %d%n", 1, 10, sum)

    // loop - 9x9table
    for (x <- 1 to 9) {
        for (y <- 1 to x) {
            print(f"${x}%2dx$y%2d=${x * y}%2d${" " * 2}")
        }
        println()
    }

    // loop, loop variable i is the same with variable i above
    // loop, there is no break or continue like java/c++
    import util.control.Breaks._

    breakable {
        for (i <- 1 to 20) {
            if (i >= 10) break
            print(i)
        }
    }
    println()

    // advanced loop: advanced for
    for (i <- 1 to 3; j <- 1 to 3) printf(f"($i,$j),")
    println()
    for (i <- 1 to 3; j <- 1 to 3 if i >= j) printf(f"($i,$j),")
    println()
    for (i <- 1 to 3; j <- 1 to 3; k <- i to j) print(f"($i,$j,$k),")
    println()
    for (i <- 1 to 3; j <- 1 to 3; k <- i to j) print(f"($i,$j,${if (i == j) k else if (j == 2) "X" else "Y"}),")
    println()
    for (i <- 1 to 9; j <- 1 to i) print(f"$i%-2dx$j%2d=${i * j}%2d${if (j == i) f"%n" else "  "}")
    for (i <- 1 to 9; j <- 1 to 9 if i >= j) print(f"$i%-2dx$j%2d=${i * j}%2d${if (j == i) f"%n" else "  "}")

    // advanced loop: for comprehension
    val list = for (i <- 1 to 10) yield i % 3
    for (i <- list) print(i)
    println
    val c1 = for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
    println(c1)
    val c2 = for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
    println(c2)
    for {
        i <- 1 to 3
        j <- 1 to 3
        k = i * j
    }
        print(f"${i}x${j}=$k ")
    println
    for (i <- 1 to 3; j <- 1 to 3; k = i * j) print(f"${i}x${j}=$k ")
    println
}
