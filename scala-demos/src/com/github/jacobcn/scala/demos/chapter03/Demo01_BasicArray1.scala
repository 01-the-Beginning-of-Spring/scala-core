package com.github.jacobcn.scala.demos.chapter03

object Demo01_BasicArray1 extends App {
    // fixed-length array
    println("-" * 10)
    val nums = new Array[Int](10)
    println(nums.toList)
    val a = new Array[String](10)
    println(a.toList)
    val s = Array("Hello", "World")
    println(s.toList)
    println(s.isInstanceOf[Array[String]])
    println(s(0))
    s(0) = "Hi"
    println(s(0))

    //variable-length array
    println("-" * 10)

    import scala.collection.mutable.ArrayBuffer

    val b = ArrayBuffer[Int]()
    println(b)
    println(b.toList)
    val bb = new ArrayBuffer[Int]()
    println(bb)
    println(bb.toList)
    b += 1
    println(b)
    b += (11, 22, 33)
    println(b)
    b ++= Array(100, 200, 300)
    println(b)
    b ++= List(1000, 2000, 3000)
    println(b)
    b.trimEnd(3)
    println(b)
    b.insert(1, 200)
    println(b)
    b.insert(2, 1000, 2000)
    println(b)
    b.remove(0)
    println(b)
    b.remove(1, 2)
    println(b)

    val b1 = b.toArray
    println(b1.isInstanceOf[Array[Int]], b1.toList)
    val b2 = b1.toBuffer
    println(b2.isInstanceOf[ArrayBuffer[Int]], b2.toList)

    // traversal
    println("-" * 10)
    println((1 to 10).toList)
    println((1 to 10 by 3).toList)
    println((10 to 1 by -1).toList)
    println((10 to 1 by -3).toList)
    println((1 until 10).toList)
    println((1 until 10 by 3).toList)
    println((10 until 1 by -1).toList)
    println((10 until 1 by -3).toList)
    for (i <- 0 until b.length) print(s"$i->${b(i)}  ")
    println
    for (e <- b) print(s"   ${e}  ")
    println
    println((0 to b.length).toList)
    println((0 to b.length by -1).toList)
    println(b.indices.toList)
    println(b.indices.reverse.toList)

}
