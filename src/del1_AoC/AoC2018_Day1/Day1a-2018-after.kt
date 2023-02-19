package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
jag har adderat inläsning till int i min fileConverter och kan du använda sum likt nedan:
https://todd.ginsberg.com/post/advent-of-code/2018/day1/
 */


class Day1a_2018_after {

    fun getFrequency2(inputList: List<Int>): Int {
        return inputList.sum()
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2018_after()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2018_Day1/actualInput")
    println(day1a.getFrequency2(listWithInput))
}
