package del1.AoC2021_Day1

import del1.FileToListConverter

/*
As the submarine drops below the surface of the ocean, it automatically performs a sonar sweep of the nearby sea floor.
On a small screen, the sonar sweep report (your puzzle input) appears:
each line is a measurement of the sea floor depth as the sweep looks further and further away from the submarine.

The first order of business is to figure out how quickly the depth increases,
just so you know what you're dealing with - you never know if the keys will get carried
into deeper water by an ocean current or a fish or something.

To do this, count the number of times a depth measurement increases from the previous measurement.
(There is no measurement before the first measurement.)

How many measurements are larger than the previous measurement?
 */

class Day1a_2021_before {

    fun getAmountOfIncreases(inputList: List<Int>): Int {
        var counter = 0
        var mapToCompare = inputList.zipWithNext()
        for ((key, value) in mapToCompare){
            if (key < value){
                counter++
            }
        }
        return counter
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2021_before()
    val listWithInput = fileToListConverter.listFromInputFileInt("src/del1/AoC2021_Day1/actualInput")
    println(day1a.getAmountOfIncreases(listWithInput))
}
