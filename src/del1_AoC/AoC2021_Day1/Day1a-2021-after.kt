package del1_AoC.AoC2021_Day1

import del1_AoC.FileToListConverter

/*
Återanvänder det exemplet jag hittat för att simplifiera min b-del även för a-delen,
även om det är en map och inte en window funkar det fint
https://github.com/ClouddJR/advent-of-code-2021/blob/master/src/main/kotlin/com/clouddjr/advent2021/Day01.kt
 */

class Day1a_2021_after {

    fun getAmountOfIncreases2(inputList: List<Int>) =
        inputList.zipWithNext().count { (key, value) -> key < value }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2021_after()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2021_Day1/actualInput")
    println(day1a.getAmountOfIncreases2(listWithInput))
}
