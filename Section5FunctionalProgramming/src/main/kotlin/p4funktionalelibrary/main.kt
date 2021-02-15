package p4funktionalelibrary

import org.funktionale.collections.destructured


import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

import org.funktionale.currying.*

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

import org.funktionale.memoization.memoize


fun main () {

    //destruction
    val (head,tail) = listOf(1,2,3).destructured()
    println("Head = $head and Tail = $tail")


    //compose
    val add5 =  {i: Int -> i+5}
    val multiplyBy2 = {i: Int -> i*2}

    val multiplyBy2andAdd5 = add5 compose multiplyBy2

    var result = multiplyBy2andAdd5(10)
    println(result)

    //forward compose : it uses result of the first function as the parameters for the second
    val add5andMultiplyBy2 = add5 forwardCompose multiplyBy2
    result = add5andMultiplyBy2(10)
    println(result)




    //currying
    val sum3ints = {x: Int , y: Int, z: Int -> x+y+z}
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val cur = curried(2)(4)(6)
    println(cur)


    //partial
    val prefixAndPostfix: (String , String , String) -> String =
        {prefix: String, x: String , postfix: String -> "${prefix}${x}${postfix}" }

    val prefixAndBang: (String,String) -> String = prefixAndPostfix.partially3("!")

    val hello: (String) -> String = prefixAndBang.partially1("Hello, ")

    println(hello("Kitty"))




    //memoization
    memo()


}


fun memo() {

    var fibonacci: (Long) -> Long = { it }
    fibonacci = {n: Long -> if (n<2) n else fibonacci(n-1) + fibonacci(n-2)}

    var m: (Long) -> Long = { it }
    m = {n : Long -> if (n<2) n else m(n-1) + m(n-2)}.memoize()

    println("Calling fib: " + timeElapsed { fibonacci(40) } + " ms")
    println("Calling memoized version: " + timeElapsed { m(40) } + " ms")

}

fun timeElapsed(body: () -> Unit):Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return  end-start
}








/*

FunKTionale is a library of functional constructs and patterns for Kotlin.

we need to add funktionale dependencies to build.gradle and refresh it:

dependencies {
    implementation ("org.funktionale:funktionale-all:1.2")
}



Composition : It's a technique. It creates a new function by combining two other function.

Currying : takes a function, which has multiple arguments, and transforms it into a chain functions,
           each of which takes one argument.
           There will be one function for each argument in the original function.


Partial application : takes a function that accepts some number of arguments, binding values to one or more of those
                      arguments, and returning new function that only accepts the remaining unbound arguments.



Memoization : Memoization is a way for us to improve the speed of code by caching the result of time consuming
              operations based on their inputs.
              *the memoized function must be pure.


*/