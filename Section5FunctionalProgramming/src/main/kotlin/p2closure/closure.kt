package p2closure

fun closureMaker(): () -> Unit {
    var num = 0
    return {println(num++)}
}


fun main(){
    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()
    myCounter1() //closure
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()

    //Where is the variable live ? that num kept in the closure.



}


/*

Closures :

- A closure is when the local variables of a function are kept alive after the function has ended.

-Unit = java's void

*/