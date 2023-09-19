fun main(args: Array<String>) {

    data class Mentor(
        val id: Int,
        val name: String
    )

    val mentors = arrayOf(
        Mentor(1, "Leonard Mutugi"),
        Mentor(2, "Jayden Jack Kinyua"),
        Mentor(1, "Alex Ezra"),
        Mentor(3, "Leonard Mutugi"))

    //Remove duplicates using distinct()
    mentors.distinct().apply {
        println(this)
    }

    //Remove duplicates using toSet()
    mentors.toSet().also {
        println(it)
    }

    //Remove duplicates using toMutableSet()
    mentors.toMutableSet().also {
        println(it)
    }

    //Remove duplicates using toHashSet()
    mentors.toHashSet().also {
        println(it)
    }

}