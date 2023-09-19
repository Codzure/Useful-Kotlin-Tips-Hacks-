fun main(args: Array<String>) {

    // TODO associateBy let us convert a list into a map.

    data class Contact(val name: String, val phoneNumber: String)

    val contacts = listOf(
        Contact("Nelly", "+254XXX11111"),
        Contact("Messi", "+254XXX22222"),
        Contact("Ronaldo", "+254XXX33333"))

    val nameToNumberMap = contacts.associateBy(
        {it.name}, {it.phoneNumber}
    )
    println(nameToNumberMap)
    /*{Nelly=+254XXX11111, Messi=+254XXX22222, Ronaldo=+254XXX33333}*/
}