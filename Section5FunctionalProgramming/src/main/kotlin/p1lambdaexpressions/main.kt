package p1lambdaexpressions

data class Student (val name:String ,var age: Int)

fun getStudents(): List<Student> {

    return listOf(
        Student("Joey",19),
        Student("Rachel",23),
        Student("Ross",20),
        Student("Monica",39),
        Student("Chandler",16),
        Student("Phoebe",25),
    )

}


fun main(args: Array<String>) {

    val students = getStudents()

    //'a' is a function parameter. Everything in between the curly braces is the lambda function.
    val combos = students.map { a -> a.name + ":" +  a.age }
    println("Combos : $combos")


    //if the lambda has only one parameter we can make it even shorter by eliminating its arguments (it  : default parameter)
    println("The oldest student : ${students.maxByOrNull { it.age }}")


    //another example
    val studentsWithLongNames = students.filter { it.name.length > 5 }
    println("Long names : $studentsWithLongNames")


}

/*

Lambda Expressions :

- They are nameless functions, (anonymous)(function-literals) Defined inside of curly braces.  {}

- Their arguments are not surrounded by parenthesis, and the arrow separate arguments from code.


*/