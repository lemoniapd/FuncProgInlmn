package del1.AoC2022_Day1

import del1.FileToListConverter

class Day1a_Before {

    fun getHighestSumValueFromInputList(inputList: List<String>): Int {
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
        return intList.get(0)
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_Before()
    val listWithInput = fileToListConverter.listFromInputFile("src/Del1/AoC2022_Day1/actualInput")
    println(day1a.getHighestSumValueFromInputList(listWithInput))
}
