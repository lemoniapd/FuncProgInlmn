package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
TBA!!!
 */


class Day1b_2015_after {

    fun getIndexOfBasement2(inputList: List<String>): Int {
        var level = 0
        var index = 0
        val stringInput = inputList.get(0)
        for (i in 0 until stringInput.length) {
            when (stringInput[i].toString()) {
                "(" -> level += 1
                ")" -> level -= 1
            }
            if (level == -1){
                index = i+1
                break
            }
        }
        return index
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2015_after()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2015_Day1/actualInput")
    println(day1b.getIndexOfBasement2(listWithInput))
}
