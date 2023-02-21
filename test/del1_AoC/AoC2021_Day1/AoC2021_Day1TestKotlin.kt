package del1_AoC.AoC2021_Day1

import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2021_Day1TestKotlin {

    val fileToListConverter = FileToListConverter()
    val testInput = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2021_Day1/testInput")
    val day1a = Day1a_2021_before()
    val day1a2 = Day1a_2021_after()
    val day1b = Day1b_2021_before()
    val day1b2 = Day1b_2021_after()

    @Test
    fun getAmountOfIncreasesTest() {
        val increases = day1a.getAmountOfIncreases(testInput)
        Assertions.assertEquals(7, increases)
    }

    @Test
    fun getAmountOfIncreases2Test() {
        val increases = day1a2.getAmountOfIncreases2(testInput)
        Assertions.assertEquals(7, increases)
    }

    @Test
    fun getAmountOfIncreasesWindowTest() {
        val increases = day1b.getAmountOfIncreasesWindow(testInput)
        Assertions.assertEquals(5, increases)
    }

    @Test
    fun getAmountOfIncreasesWindow2Test() {
        val increases = day1b2.getAmountOfIncreasesWindow2(testInput)
        Assertions.assertEquals(5, increases)
    }
}
