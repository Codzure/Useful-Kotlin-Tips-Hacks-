fun main(args: Array<String>) {

    /*In this example, we use the toDoubleOrNull method to parse name as a double, and if it's successful, isNumber is set to true.
    If toDoubleOrNull returns null, we use the toIntOrNull method to parse name as an int, and if it's successful, isNumber is set to true.
    If neither method succeeds, isNumber remains false.*/

    val name = "123"

    val isNumber = name.toDoubleOrNull() != null || name.toIntOrNull() != null

    println("Is $name a number? $isNumber") // prints "Is 123 a number? true"

}