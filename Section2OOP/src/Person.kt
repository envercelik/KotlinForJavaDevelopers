class Person (firstName: String , lastName: String) {

    init {
        println("Create a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName:String):this(firstName,lastName)

}

/*

- A class can have one primary constructor and multiple secondary constructor
- The primary constructor can't have any code but it can add an initializer block

*/