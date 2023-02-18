package del1.AoC2022_Day1

import del1.FileToListConverter

class Day1b_2022_before {
    fun getHighestThreeSumValueFromInputList(inputList: List<String>): Int {
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
        return intList.get(0) + intList.get(1) + intList.get(2)
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2022_before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/actualInput")
    println(day1b.getHighestThreeSumValueFromInputList(listWithInput))
}
