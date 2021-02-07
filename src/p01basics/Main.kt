package p01basics

import kotlin.math.abs

fun main(args: Array<String>) {

    // TYPE SYSTEM

    /*
        val : used when the variable doesn't change (immutable declaration)
        var : can change over a program's lifetime (mutable declaration)

        *val is preferred and considered a best practise
        *immutable objects are thread-safe
        *immutable data makes code parallelization easier
        *references to immutable objects can be cached

    */

    val aString = "I'm a string"
    val anInt = 10
    val aLong = 100000L
    val aDouble = 10.12
    val aFloat = 10.12f


    val myString: String
    val myInt: Int
    val myDouble: Double
    val myFloat: Float
    val myByte: Byte
    val myLong: Long


    val number: Int = 25
    val sentence : String = "I'm a sentence"

    //conversion
    val numberInt: Int = 250
    val numberLong : Long = numberInt.toLong()








    //CONTROL FLOW - if

    /*
        'if' is an expression not a statement in kotlin
        statement  : program instructions that return no value;can't be on the right side of an equals sign
        expression : program instructions that returns values; can be on the right side of an equals sign

    */

    val temp = 80
    val isAirConditionerOn = if (temp >=80) {
        println("it is warm")
        true
    } else {
        println("it is not so warm")
        false
    }
    println("is the air conditioner on: $isAirConditionerOn" )




    //CONTROL-FLOW - when

    val burgersOrdered = 2

    when(burgersOrdered) {

        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very Hungry")
        else -> {
            println("Are you sure?")
        }

    }

    //usage 2

    when(burgersOrdered) {
        abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("Ordered less than zero")
        }
    }


    //usage 3

    when(burgersOrdered) {
        0-> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    //usage 4

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered  % 2 == 1 -> println("Odd number ordered")
        burgersOrdered %2 == 0 -> println("Even number ordered")

    }



    //CONTROL FLOW - LOOP


    for (item in 1..10) {
        print("$item , ")
    }
    //item is a "val" (immutable)


    for (ch in "biscuit") {
        print(ch)
    }


    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        print("${++ndx}) $item ,")
    }

    //without having to create another variable
    for ((index,item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index+1}) $item,")
    }


    val myArray = arrayOf(10,20,30,40,50)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }





    //FUNCTION

    fun myFunction1(param1: Int , param2: Int): Int {
        return param1+param2
    }

    //without {}
    fun myFunction(param1: Int , param2: Int): Int = param1+param2

    //without {} and  return type
    fun muFunction(param1: Int , param2: Int) = param1+param2




    //KOTLIN DEFAULT IMPORTS

    /*
        -kotlin.*
        -kotlin.annotation.*
        -kotlin.collections.*
        -kotlin.comparisons.*
        -kotlin.io.*
        -kotlin.ranges.*
        -kotlin.sequences.*
        -kotlin.text.*
        -java.lang.*
        -kotlin.jvm.*

    */






    //PRACTISE - FIZZ BUZZ

    // Create a loop to display the number 1 to 185
    // after the number
    // print "fizz" if the number is divisible by 3
    // print "buzz" if te number is divisible by 5
    // print "fizz buzz" if the numbe is divisible by 3 and 5


    for (item in 1..185) {
        print(item)

        when {

            item % 3 == 0 && item % 5 == 0 -> print("fizz buzz")
            item % 3 == 0 -> print("fizz")
            item % 5 == 0 -> print("buzz")
        }
        println()

    }



























}