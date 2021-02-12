package operatoroverloading

data class Position (var x:Int, var y:Int) {

    //operator overloading for plus operator.
    operator fun plus(other: Position): Position {

        return Position(x+other.x , y+other.y)

    }

}


fun main() {

    val p1 = Position(10,20)
    val p2 = Position(7,4)


    val p3 = p1+p2

    println(p3)
}