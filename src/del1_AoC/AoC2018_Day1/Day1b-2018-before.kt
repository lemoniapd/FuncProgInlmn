package del1_AoC.AoC2018_Day1

import del1_AoC.FileToListConverter

/*You notice that the device repeats the same frequency change list over and over. To calibrate the device, you need to find the first frequency it reaches twice.

For example, using the same list of changes above, the device would loop as follows:

Current frequency  0, change of +1; resulting frequency  1.
Current frequency  1, change of -2; resulting frequency -1.
Current frequency -1, change of +3; resulting frequency  2.
Current frequency  2, change of +1; resulting frequency  3.
(At this point, the device continues from the start of the list.)
Current frequency  3, change of +1; resulting frequency  4.
Current frequency  4, change of -2; resulting frequency  2, which has already been seen.
In this example, the first frequency reached twice is 2. Note that your device might need to repeat its list of frequency changes many times before a duplicate frequency is found, and that duplicates might be found while in the middle of processing the list.

Here are other examples:

+1, -1 first reaches 0 twice.
+3, +3, +4, -2, -4 first reaches 10 twice.
-6, +3, +8, +5, -6 first reaches 5 twice.
+7, +7, -2, -7, -4 first reaches 14 twice.
What is the first frequency your device reaches twice?
 */


class Day1b_2018_before {

    fun getAllFrequencies(inputList: List<String>): List<Int> {
        val intList = mutableListOf<Int>()
        val listOfFrequencies = mutableListOf<Int>()
        var frequency = 0
        for (element in inputList) {
            intList.add(element.toInt())
        }
        for (element in intList) {
            if (element < 0) {
                frequency -= (element - element * 2)
                listOfFrequencies.add(frequency)
            }
            if (element > 0) {
                frequency += element
                listOfFrequencies.add(frequency)
            }
        }
        return listOfFrequencies
    }

    fun getFirstDuplicate(fullList: List<Int>): Int {
        val seen: MutableSet<Int> = mutableSetOf()
        var firstDupelicate = 0
        for (i in fullList) {
            if (!seen.add(i))
                firstDupelicate = i
        }
        return firstDupelicate
    }

    fun findAllDuplicates(fullList: List<Int>): Set<Int> {
        val seen: MutableSet<Int> = mutableSetOf()
        val duplicates: MutableSet<Int> = mutableSetOf()
        for (i in fullList) {
            if (!seen.add(i)) {
                duplicates.add(i)
            }
        }
        return duplicates
    }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day1b = Day1b_2018_before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1/AoC2018_Day1/actualInput")
    println(day1b.getAllFrequencies(listWithInput).joinToString(":"))
}
