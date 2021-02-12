package dsl

import java.lang.RuntimeException

interface Matcher<T> {

    fun test(lhs: T ): Unit



    infix fun or(other: Matcher<T>) : Matcher<T> = object : Matcher<T> {
        override fun test(lhs: T) {

            try {
                this@Matcher.test(lhs)
            } catch (e: RuntimeException) {
                other.test(lhs)
            }
        }
    }

}



infix fun <T>T.should(matcher: Matcher<T>) {
    matcher.test(this)
}



infix fun <T> Collection<T>.should(fn :CollectionMatchers<T>.()->Unit) {
    val matchers = CollectionMatchers(this)
    matchers.fn()
}



class CollectionMatchers<T>(private val collection: Collection<T>) {
    fun contains(rhs: T ) : Unit {
        if (!collection.contains(rhs))
            throw RuntimeException("Collection did not contain $rhs")
    }

    fun notContains(rhs: T): Unit {
        if (collection.contains(rhs)) {
            throw RuntimeException("Collection should not contain $rhs")
        }
    }

    fun haveSizeLessThan(size: Int): Unit {
        if (collection.size >= size)
            throw RuntimeException("Collection should have size less than $size")


    }
}



fun unitTest() {
    val listOfNames = listOf("April","May","June")
    listOfNames should  { notContains("Portia")}
}




/*

- domain-specific language (dsl) is a computer language which is focused on a very narrow problem set.
  This is a very small DSL example to help us unit test Kotlin code.
  (we'll actually write our unit test in our DSL)

- Traditional unit test framework use assert, many modern ones strive to make test readable.
  Kotlin has many features which can help us to achieve a more english - like sentence structure.


*/