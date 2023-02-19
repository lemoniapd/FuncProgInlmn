package del1_AoC.AoC2015_Day1

import del1_AoC.AoC2018_Day1.Day1a_2015_after
import del1_AoC.AoC2018_Day1.Day1a_2015_before
import del1_AoC.AoC2018_Day1.Day1b_2015_after
import del1_AoC.AoC2018_Day1.Day1b_2015_before
import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2015_Day1TestKotlin {

    var fileToListConverter = FileToListConverter()
    var testInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2015_Day1/testInput")
    var day1a = Day1a_2015_before()
    var day1a2 = Day1a_2015_after()
    var day1b = Day1b_2015_before()
    var day1b2 = Day1b_2015_after()

    @Test
    fun getFloorLevelTest() {
        val level = day1a.getFloorLevel(testInput)
        Assertions.assertEquals(-1, level)
    }

    @Test
    fun getIndexOfBasementTest() {
        val index = day1b.getIndexOfBasement(testInput)
        Assertions.assertEquals(5, index)
    }

    @Test
    fun getFloorLevel2Test() {
        val level = day1a2.getFloorLevel2(testInput)
        Assertions.assertEquals(-1, level)
    }

    @Test
    fun getIndexOfBasement2Test() {
        val index = day1b2.getIndexOfBasement2(testInput)
        Assertions.assertEquals(5, index)
    }
}
