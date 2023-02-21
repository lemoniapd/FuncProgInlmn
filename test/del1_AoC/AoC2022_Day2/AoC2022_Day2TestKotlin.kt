package del1_AoC.AoC2022_Day2

import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class AoC2022_Day2TestKotlin {

    val fileToListConverter = FileToListConverter()
    val testInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day2/testInput")
    val day2a = Day2a_2022_before()
    val day2a2 = Day2a_2022_after()
    val day2b = Day2b_2022_before()
    val day2b2 = Day2b_2022_after()

    @Test
    fun getMyScoreTest() {
        val myScore = day2a.getMyScore(testInput)
        Assertions.assertEquals(15, myScore)
    }

    @Test
    fun getMyScore2Test() {
        val myScore = day2a2.getMyScore2(testInput)
        Assertions.assertEquals(15, myScore)
    }

    @Test
    fun getMyNewScoreTest() {
        val myScore = day2b.getMyNewScore(testInput)
        Assertions.assertEquals(12, myScore)
    }

    @Test
    fun getMyNewScore2Test() {
        val myScore = day2b2.getMyNewScore2(testInput)
        Assertions.assertEquals(12, myScore)
    }
}