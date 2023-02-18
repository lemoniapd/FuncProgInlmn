package del1_AoC.AoC2015_Day1

import del1_AoC.AoC2018_Day1.Day1a_2015_before
import del1_AoC.AoC2018_Day1.Day1b_2015_before
import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2015_Day1TestKotlin

var fileToListConverter = FileToListConverter()
var input = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2015_Day1/actualInput")
var day1a = Day1a_2015_before()
var day1b = Day1b_2015_before()


@Test
fun getFloorLevelTest() {
    val level = day1a.getFloorLevel(input)
    Assertions.assertEquals(74, level)
}

@Test
fun getIndexOfBasementTest() {
    val index = day1b.getIndexOfBasement(input)
    Assertions.assertEquals(1795, index)
}