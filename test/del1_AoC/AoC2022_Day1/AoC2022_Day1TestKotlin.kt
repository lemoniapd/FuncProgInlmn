package del1_AoC.AoC2022_Day1

import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class Day1a_BeforeTestKotlin {

    val fileToListConverter = FileToListConverter()
    val testInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day1/testInput")
    val day1a = Day1a_2022_before()
    val day1a2 = Day1a_2022_after()
    val day1b = Day1b_2022_before()
    val day1b2 = Day1b_2022_after()

    @Test
    fun getHighestSumValueFromInputListTest() {
        val highestTestValue = day1a.getHighestSumValueFromInputList(testInput)
        assertEquals(24000, highestTestValue)
    }

    @Test
    fun getHighestSumValueFromInputList2Test() {
        val highestTestValue = day1a2.getHighestSumValueFromInputList2(testInput)
        assertEquals(24000, highestTestValue)
    }

    @Test
    fun getHighestThreeSumValueFromInputListTest() {
        val highestThreeTestValues = day1b.getHighestThreeSumValueFromInputList(testInput)
        assertEquals(41000, highestThreeTestValues)
    }

    @Test
    fun getHighestThreeSumValueFromInputList2Test() {
        val highestThreeTestValues = day1b2.getHighestThreeSumValueFromInputList2(testInput)
        assertEquals(41000, highestThreeTestValues)
    }
}
