package del1_AoC.AoC2022_Day1

import del1_AoC.FileToListConverter

class Day1a_2022_before {

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
    val day1a = Day1a_2022_before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/actualInput")
    println(day1a.getHighestSumValueFromInputList(listWithInput))
}
