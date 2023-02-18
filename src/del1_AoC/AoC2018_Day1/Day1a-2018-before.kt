package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*
"Error: Device must be calibrated before first use. Frequency drift detected. Cannot maintain destination lock." Below the message, the device shows a sequence of changes in frequency (your puzzle input). A value like +6 means the current frequency increases by 6; a value like -3 means the current frequency decreases by 3.

For example, if the device displays frequency changes of +1, -2, +3, +1, then starting from a frequency of zero, the following changes would occur:

Current frequency  0, change of +1; resulting frequency  1.
Current frequency  1, change of -2; resulting frequency -1.
Current frequency -1, change of +3; resulting frequency  2.
Current frequency  2, change of +1; resulting frequency  3.
In this example, the resulting frequency is 3.

Here are other example situations:

+1, +1, +1 results in  3
+1, +1, -2 results in  0
-1, -2, -3 results in -6
Starting with a frequency of zero, what is the resulting frequency after all of the changes in frequency have been applied?
 */


class Day1a_2018_before {

    fun getFrequency(inputList: List<String>): Int {
        val intList = mutableListOf<Int>()
        var frequency = 0
        for (element in inputList) {
            intList.add(element.toInt())
        }
        for (element in intList) {
            if (element < 0) {
                frequency -= (element-element*2)
            }
            if (element > 0) {
                frequency += element
            }
        }
        return frequency
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day1a = Day1a_2018_before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1/AoC2018_Day1/actualInput")
    println(day1a.getFrequency(listWithInput))
}
