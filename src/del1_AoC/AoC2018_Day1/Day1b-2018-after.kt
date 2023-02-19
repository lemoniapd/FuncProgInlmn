package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
TBA!!!
 */


class Day1b_2018_after {

    fun getFirstDuplicate2(fullList: List<Int>): Int {
        val seen = mutableSetOf<Int>()
        var currentFrequency = 0
        while (true) {
            for (i in fullList) {
                currentFrequency += i
                if (seen.contains(currentFrequency)) {
                    return currentFrequency
                }
                seen.add(currentFrequency)
            }
        }
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2018_after()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2018_Day1/actualInput")
    println(day1b.getFirstDuplicate2(listWithInput))
}
