package del1_AoC.AoC2022_Day1

import del1_AoC.FileToListConverter

/*
take(3) istället för att plussa ihop de 3 första elementen
https://todd.ginsberg.com/post/advent-of-code/2022/day1/
 */

class Day1b_2022_after {
    fun getHighestThreeSumValueFromInputList2(inputList: List<String>): Int {
        val intList = mutableListOf<Int>()
        var sum = 0
        for (element in inputList) {
            if (element.isNullOrBlank()) {
                intList.add(sum)
                sum = 0
            } else {
                sum += element.toInt()
            }
        }
        intList.sortDescending()
        return intList.take(3).sum()
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2022_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day1/actualInput")
    println(day1b.getHighestThreeSumValueFromInputList2(listWithInput))
}
