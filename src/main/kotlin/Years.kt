import java.util.*

fun main(args: Array<String>){
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val years = mutableListOf<Int>()

    for (year in currentYear downTo currentYear - 14) {
        years.add(year)
    }

    println(years)
}