package del1_AoC.AoC2021_Day1

import del1_AoC.FileToListConverter

/*
Istället för att skapa en window och gå igenom den i en for-loop räknas increases direkt med count i lambdan
https://github.com/ClouddJR/advent-of-code-2021/blob/master/src/main/kotlin/com/clouddjr/advent2021/Day01.kt
 */

class Day1b_2021_after {

    fun getAmountOfIncreasesWindow2(inputList: List<Int>): Int {
        return inputList.windowed(3).count { element -> element.last() > element.first() }
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2021_after()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2021_Day1/actualInput")
    println(day1b.getAmountOfIncreasesWindow2(listWithInput))
}
