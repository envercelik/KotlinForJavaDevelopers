package destruction


data class Position (val x:Int, val y:Int) {

}


class Point(private val x: Int, private val y: Int, private val z: Int) {
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}




fun main() {

    val p1 = Position(75,150)


    //Kotlin gets the value for each variable based on the order that the properties were created in their constructor.
    val (xPosition, yPosition) = p1
    println("xPosition = $xPosition , yPosition = $yPosition")


    //Kotlin creates some operators . The first operator is component1, The second operator is component2...
    println("c1 =  ${p1.component1()}" )



    //* for non data class we must add the operator component manually
    val myPoint = Point(10,20,30)
    val (myX,myY,myZ) = myPoint
    println("$myX - $myY - $myZ")




}




/*
- Destructuring is a way for us to pull just the variables we want from a more complicated object.




*/