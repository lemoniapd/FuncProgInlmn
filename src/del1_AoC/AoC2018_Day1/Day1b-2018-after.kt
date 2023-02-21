package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
Använder som i 2015 en sequence och därefter lambda istället för for-loop för att iterera,
ingen extension function behövs som på länk nedan utan det går bra att direkt använda Kotlin's asSequence
https://todd.ginsberg.com/post/advent-of-code/2018/day1/
 */


class Day1b_2018_after {

    fun getFirstDuplicate2(fullList: List<Int>): Int {
        val seen = mutableSetOf<Int>()
        var currentFrequency = 0
        return fullList.asSequence().map {
            currentFrequency += it
            currentFrequency}.first{!seen.add(it)}
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2018_after()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2018_Day1/actualInput")
    println(day1b.getFirstDuplicate2(listWithInput))
}
