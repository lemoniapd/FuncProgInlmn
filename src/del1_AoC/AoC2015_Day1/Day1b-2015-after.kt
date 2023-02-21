package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
Återanvänder kod från dag 1a's efter-version för att gå igenom int-lista som sequence (som har ett index som returneras) i en lambda
OBS i efterversion returneras indexOf(-1) (occurence of) och inte indexet för där -1 uppstår första gången
https://windmaomao.medium.com/kotlin-day-1-up-and-down-38885a5fc2b1
 */


class Day1b_2015_after {

    fun getIndexOfBasement2(inputList: List<String>): Int {
        val stringInput = inputList.get(0)
        val intList =stringInput.map { mappingValue2(it) }.toList()
        return intList.asSequence()
            .scan(0) { acc, v -> acc + v }
            .indexOf(-1)
    }

    fun mappingValue2(c: Char) = when (c) {
        '(' -> 1
        ')' -> -1
        else -> 0
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2015_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2015_Day1/actualInput")
    println(day1b.getIndexOfBasement2(listWithInput))
}
