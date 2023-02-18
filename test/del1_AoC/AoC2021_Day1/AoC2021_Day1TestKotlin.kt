package del1_AoC.AoC2021_Day1

import del1_AoC.AoC2018_Day1.Day1a_2018_before
import del1_AoC.AoC2018_Day1.Day1b_2018_before
import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2021_Day1TestKotlin



var fileToListConverter = FileToListConverter()
var testInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2021_Day1/testInput")
var day1a = Day1a_2021_before()
var day1b = Day1b_2021_before()
@Test
fun getAmountOfIncreasesTest() {
    val frequency = day1a.getAmountOfIncreases(testInput)
    Assertions.assertEquals(17, frequency)
}