package del1_AoC.AoC2018_Day1


import del1_AoC.AoC2022_Day2.Day2a_Before
import del1_AoC.AoC2022_Day2.Day2b_Before
import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2018_Day1TestKotlin


var fileToListConverter = FileToListConverter()
var testInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2018_Day1/testInput")
var day1a = Day1a_2018_before()
var day1b = Day1b_2018_before()
@Test
fun getFrequencyTest() {
    val frequency = day1a.getFrequency(testInput)
    Assertions.assertEquals(17, frequency)
}
/*
@Test
fun getMyScore2Test() {
    val myScore = day2b.getMyScore2(testInput)
    Assertions.assertEquals(12, myScore)
}

 */