package com.github.jacobcn.scala.demos

import scala.collection.mutable.ArrayBuffer

object Demo02_BasicArray2 extends App {

    // 1, transfer an Array
    println("-" * 10)
    val a = (1 to 9).toArray
    val a1 = for (e <- a) yield e * 2
    val a2 = for (e <- a if e % 3 == 0) yield e
    val a3 = for (e <- a) yield if (e % 3 == 0) e * 10 else e
    println(a.mkString(", "))
    println(a1.mkString(", "))
    println(a2.mkString(", "))
    println(a3.mkString(", "))

    println("-" * 10)
    val a4 = a.filter(_ % 2 == 1)
    val a4x = a filter {
        _ % 2 == 1
    }
    println(a4.mkString(", "))
    println(a4x.mkString(", "))
    val a5 = a.filter(_ % 2 == 0).map(_ + "- ")
    val a5x = a filter {
        _ % 2 == 0
    } map {
        _ + 10
    }
    println(a5.mkString(", "))
    println(a5x.mkString(", "))

    // 2, a good filter to change an ArrayBuffer
    println("-" * 10)
    val b = ArrayBuffer(3, -2, 4, 1, 0, -3, 2)
    println(b.toList)
    val keepIndex = for (i <- b.indices if b(i) >= 0) yield i
    for (j <- keepIndex.indices) b(j) = b(keepIndex(j))
    println(b.toList)
    b.trimEnd(b.length - keepIndex.length)
    println(b.toList)

    //3, Algorithms
    println("-" * 10)
    val ci = (1 to 10).toArray
    println(ci.mkString("sum[", ", ", f"] = ${ci.sum}"))
    println(ci.mkString("max[", ", ", f"] = ${ci.max}"))
    println(ci.mkString("min[", ", ", f"] = ${ci.min}"))
    val cd = Array(1.0, 2.0, 3.0, 4.0, 5.0)
    println(cd.mkString("sum[", ", ", f"] = ${cd.sum}"))
    val cI: Array[BigInt] = (1 to 100).toArray.map(BigInt(_))
    println((cI.slice(0, 3) ++ Array("... ") ++ cI.filter(_ > 97)).mkString("sum[", ", ", f"] = ${cI.sum}"))

    //4, sort
    println("-" * 10)
    val c1 = Array(1, 3, 3, 2, 5, 4)
    val c1Sorted = c1.sorted
    println(c1.mkString("before sort [", ", ", "]"))
    println(c1Sorted.mkString("after sort  [", ", ", "]"))
    val c1SortedX = c1.sortWith(_ > _)
    println(c1SortedX.mkString("own sort  [", ", ", "]"))
    val cx = Array(1, 3, 2)
    println(cx.mkString("before [", ", ", "]"))
    scala.util.Sorting.quickSort(cx)
    println(cx.mkString("quickSort [", ", ", "]"))

}
