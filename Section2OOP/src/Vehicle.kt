interface Vehicle {

    val makeName:String

    fun go(){
        println("go()")
    }

    fun stop(){
        println("stop()")
    }

    fun getDoors():Int

}