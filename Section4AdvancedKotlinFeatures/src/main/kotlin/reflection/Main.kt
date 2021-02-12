package reflection

import kotlin.reflect.full.memberProperties

class Customer(var name:String, var surname:String) {

}


fun main() {

    val customer1 = Customer("Enver","Çelik") //this object is created at runtime

    val kClass = customer1.javaClass.kotlin
    println("Class name : ${kClass.simpleName}")

    kClass.members

    println("properties : ")
    for (name in  kClass.memberProperties){
        println(name.name)
    }

}


/*

- reflection allow us to access programmatic information dynamically at run time.

- kotlin-reflect.jar must be added to class path.

*/