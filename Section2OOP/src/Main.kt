
fun main(args: Array<String>) {

    val me = Person("Enver","Celik")
    val  anotherOne = Person("Defne", "miray" ,"emre")


    //- Object don't need classes to create them.
    val location = object {

        var xPosition = 200
        var yPosition = 400

        fun printIt() {
            "Position = ($xPosition $yPosition)"
        }
    }

    location.printIt()



    val myCar = Car()

    myCar.go()
    myCar.stop()
    println("Name : ${myCar.makeName} \nDoors : ${myCar.getDoors()}")
    myCar.getDoors()


    val maxInt:Int = max(15,25)
    val maxString:String = max("Beta","Alpha")

    println(maxInt)
    println(maxString)




}
