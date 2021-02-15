package p3sequences

import p1lambdaexpressions.getStudents


fun main() {

    //one way to create a sequence is to convert a collection.
    val student = getStudents()
    val sequenceStudents = student.drop(1).take(3).toList()
    println("Sequenced Students : $sequenceStudents")


    //we can also generate sequences on the fly.
    val numbers = generateSequence(100) { it+1 }
    println("Numbers: ${numbers.drop(5).take(20).toList()}")



    //another example
    val squares = generateSequence(1) { it+1 }.map { it*it }
    val evenSquares = squares.filter { it % 2 ==0 }
    println("Even Squares : ${evenSquares.take(5).toList()}")


    //another example
    val fib = generateSequence(1 to 1) { it.second   to   it.first + it.second }.map { it.first }
    println("Fibonacci : ${fib.take(15).toList()}")



}


/*

Sequences :

- They are identical to streams in java.

- that streams can do that sequences can't run across multiple CPUs.

- sequences are not collections. A sequence isn't generated until a terminal operation such as a sum or a toList, is called.
  But a collection always exist.

*/