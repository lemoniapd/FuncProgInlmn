package del1.AoC2015_Day1

import del1.FileToListConverter

/*
Now, given the same instructions, find the position of the first character that causes him to enter the basement (floor -1).
The first character in the instructions has position 1, the second character has position 2, and so on.

For example:

) causes him to enter the basement at character position 1.
()()) causes him to enter the basement at character position 5.
What is the position of the character that causes Santa to first enter the basement?
 */


class Day1b_Before {

    fun getIndexOfBasement(inputList: List<String>): Int {
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
    val day1b = Day1b_Before()
    val listWithInput = fileToListConverter.listFromInputFile("/Users/lemoniapalmqvist/IdeaProjects/FuncProgInlmn/src/del1/AoC2015_Day1/actualInput")
    println(day1b.getIndexOfBasement(listWithInput))
}
