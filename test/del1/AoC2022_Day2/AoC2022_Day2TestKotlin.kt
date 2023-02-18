package del1.AoC2022_Day2

import del1.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions
import java.util.*

internal class AoC2022_Day2TestKotlin

var fileToListConverter = FileToListConverter()
var testInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day2/testInput")
var day2a = Day2a_Before()
var day2b = Day2b_Before()


@Test
fun listFromInputFileTest() {
    val listToCompare = Arrays.asList("A Y", "B X", "C Z")
    Assertions.assertEquals(listToCompare.size, testInput.size)
}

@Test
fun getMyScoreTest() {
    val myScore = day2a.getMyScore(testInput)
    Assertions.assertEquals(15, myScore)
}

@Test
fun getMyScore2Test() {
    val myScore = day2b.getMyScore2(testInput)
    Assertions.assertEquals(12, myScore)
}