package del1_AoC.AoC2022_Day1

import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class Day1a_BeforeTestKotlin


var fileToListConverter = FileToListConverter()
var testInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/testInput")
var day1a = Day1a_2022_before()
var day1b = Day1b_2022_before()


@Test
fun listFromInputFileTest() {
    val listToCompare = Arrays.asList("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000")
    assertEquals(testInput.size, listToCompare.size)
}

//1a
@Test
fun getHighestSumValueFromInputListTest() {
    val highestTestValue = day1a.getHighestSumValueFromInputList(testInput)
    assertEquals(24000, highestTestValue)
}

//1b
@Test
fun getHighestThreeSumValueFromInputListTest() {
    val highestThreeTestValues = day1b.getHighestThreeSumValueFromInputList(testInput)
    assertEquals(41000, highestThreeTestValues)
}
