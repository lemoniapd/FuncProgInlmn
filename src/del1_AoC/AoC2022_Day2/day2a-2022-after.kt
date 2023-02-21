package del1_AoC.AoC2022_Day2

import del1_AoC.FileToListConverter

/*
Återanvänder samma som jag kommit över för 2015-uppgifterna
Mappning av de olika kombinationerna till int i egen metod,
loppar över en int-lista i lamdba istället för att loopa genom en sträng-lista i for-loop:
https://windmaomao.medium.com/kotlin-day-1-up-and-down-38885a5fc2b1
 */

class Day2a_2022_after {
    fun getMyScore2(inputList: List<String>): Int {
        val intList =inputList.map { mappingValue(it) }.toList()
        return intList.sum()
    }

    fun mappingValue(s: String) = when (s) {
        "A X" -> 4
        "A Y" -> 8
        "A Z" -> 3
        "B X" -> 1
        "B Y" -> 5
        "B Z" -> 9
        "C X" -> 7
        "C Y" -> 2
        "C Z" -> 6
        else -> 0
    }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day2a = Day2a_2022_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day2/actualInput")
    println(day2a.getMyScore2(listWithInput))
}
