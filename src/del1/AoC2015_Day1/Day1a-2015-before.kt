package del1.AoC2018_Day1

import del1.FileToListConverter

/*
Santa is trying to deliver presents in a large apartment building,
but he can't find the right floor - the directions he got are a little confusing.
He starts on the ground floor (floor 0) and then follows the instructions one character at a time.

An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.

The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.

For example:

(()) and ()() both result in floor 0.
((( and (()(()( both result in floor 3.
))((((( also results in floor 3.
()) and ))( both result in floor -1 (the first basement level).
))) and )())()) both result in floor -3.
To what floor do the instructions take Santa?
 */


class Day1a_2015_before {

    fun getFloorLevel(inputList: List<String>): Int {
        var level = 0
        val stringInput = inputList.get(0)
        for (i in 0 until stringInput.length) {
            when (stringInput[i].toString()) {
                "(" -> level += 1
                ")" -> level -= 1
            }
        }
        return level
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2015_before()
    val listWithInput = fileToListConverter.listFromInputFileString("/Users/lemoniapalmqvist/IdeaProjects/FuncProgInlmn/src/del1/AoC2015_Day1/actualInput")
    println(day1a.getFloorLevel(listWithInput))
}
