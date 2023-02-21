package del1_AoC.AoC2022_Day2

import del1_AoC.FileToListConverter

/*
Återanvänder samma som jag kommit över för 2015-uppgifterna
Mappning av de olika kombinationerna till int i egen metod,
loppar över en int-lista i lamdba istället för att loopa genom en sträng-lista i for-loop:
https://windmaomao.medium.com/kotlin-day-1-up-and-down-38885a5fc2b1
 */

class Day2b_2022_after {
    fun getMyNewScore2(inputList: List<String>): Int {
        val intList =inputList.map { mappingValue(it) }.toList()
        return intList.sum()
    }

    fun mappingValue(s: String) = when (s) {
        "A X" -> 3
        "A Y" -> 4
        "A Z" -> 8
        "B X" -> 1
        "B Y" -> 5
        "B Z" -> 9
        "C X" -> 2
        "C Y" -> 6
        "C Z" -> 7
        else -> 0
    }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day2b = Day2b_2022_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day2/actualInput")
    println(day2b.getMyNewScore2(listWithInput))
}
