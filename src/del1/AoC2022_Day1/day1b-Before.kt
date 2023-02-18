package Del1.AoC2022_Day1

import Del1.FileReader

class Day1b_Before {
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
        //println(intList.joinToString(" "))
        return intList.get(0) + intList.get(1) + intList.get(2)
    }
}

fun main() {
    val fileReader = FileReader()
    val day1b = Day1b_Before()
    val listWithInput = fileReader.listFromInputFile("src/Del1/AoC2022_Day1/actualInput")
    println(day1b.getHighestThreeSumValueFromInputList(listWithInput))
}
