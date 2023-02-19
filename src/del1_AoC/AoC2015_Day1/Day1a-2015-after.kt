package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
Mappning av de olika tecknen till int i egen metod,
loppar över en int-lista i lamdba istället för att loopa genom en sträng i for-loop:
https://windmaomao.medium.com/kotlin-day-1-up-and-down-38885a5fc2b1
 */


class Day1a_2015_after {

    fun getFloorLevel2(inputList: List<String>): Int {
        val stringInput = inputList.get(0)
        val intList =stringInput.map { mappingValue(it) }.toList()
        return intList.sum()
    }

    fun mappingValue(c: Char) = when (c) {
        '(' -> 1
        ')' -> -1
        else -> 0
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2015_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2015_Day1/actualInput")
    println(day1a.getFloorLevel2(listWithInput))
}
