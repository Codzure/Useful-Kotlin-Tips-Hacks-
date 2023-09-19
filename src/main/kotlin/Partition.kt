fun main(args: Array<String>) {

    // TODO partition filters a collection by a predicate and keeps the elements that don't match it in a separate list.

    data class User(val id: Int, val name: String, val isMentor: Boolean)

    val users = arrayOf(
        User(1, "Sam", true),
        User(2, "Ronaldo", false),
        User(1, "Messi", true),
        User(3, "Neymar", false)
    )

    // Now, let's use the partition function on this list of users to filter the users who are a mentor and the users who are not a mentor.

    val (mentors, notMentors) = users.partition { it.isMentor }

    println(mentors)
    println(notMentors)


    /*
    *
    * Note:
It takes a predicate.
It splits the original array into pair of lists and returns Pair<List<T>, List<T>>.
The first list contains elements for which the predicate yields true.
The second list contains elements for which the predicate yields false.
* */
}