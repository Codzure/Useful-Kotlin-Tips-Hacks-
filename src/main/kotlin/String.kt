
fun main(args: Array<String>){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println("map.containsValue(2) = ${map.containsValue(2)}") // prints "map.containsValue(2) = true"
    println("map.containsValue(4) = ${map.containsValue(4)}") // prints "map.containsValue(4) = false"

    println("map.containsKey(\"b\") = ${map.containsKey("b")}") // prints "map.containsKey("b") = true"
    println("map.containsKey(\"d\") = ${map.containsKey("d")}") // prints "map.containsKey("d") = false"
}



/*In this example, map is a Map with 3 key-value pairs, and we are using the containsValue method to check if the value 2
is present in the map, and the containsKey method to check if the key "b" is present in the map.*/



