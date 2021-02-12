package annotation

class Animal(name:String , kind:String , weight:Int) {
}

@Deprecated("Deprecated",ReplaceWith("Animal"))
class Person(name:String , surname:String) {
}

fun main() {

    val person = Person("Johny","Bravo")


}

/*

Annotations are attach metadata to code. (similar to java)

*/