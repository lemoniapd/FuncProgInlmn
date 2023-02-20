package del1_AoC.AoC2022_Day1

import del1_AoC.FileToListConverter

/*
first() istället för att ta index 0
https://todd.ginsberg.com/post/advent-of-code/2022/day1/
 */

class Day1a_2022_after {

    fun getHighestSumValueFromInputList2(inputList: List<String>): Int {
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
        return intList.first()
    }
}
fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2022_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/actualInput")
    println(day1a.getHighestSumValueFromInputList2(listWithInput))
}
