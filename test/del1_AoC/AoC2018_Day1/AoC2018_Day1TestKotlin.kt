package del1_AoC.AoC2018_Day1


import del1_AoC.FileToListConverter
import org.junit.Test
import org.junit.jupiter.api.Assertions

class AoC2018_Day1TestKotlin {

    val fileToListConverter = FileToListConverter()
    val testInputString = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2018_Day1/testInput")
    val testInputInt = fileToListConverter.listFromInputFileInt("src/del1_AoC/AoC2018_Day1/testInput")
    val day1a = Day1a_2018_before()
    val day1a2 = Day1a_2018_after()
    val day1b = Day1b_2018_before()
    val day1b2 = Day1b_2018_after()

    @Test
    fun getFrequencyTest() {
        val frequency = day1a.getFrequency(testInputString)
        Assertions.assertEquals(17, frequency)
    }

    @Test
    fun getFrequency2Test() {
        val frequency = day1a2.getFrequency2(testInputInt)
        Assertions.assertEquals(17, frequency)
    }

    @Test
    fun getFirstDuplicateTest() {
        val firstDupe = day1b.getFirstDuplicate(testInputInt)
        Assertions.assertEquals(-1, firstDupe)
    }

    @Test
    fun getFirstDuplicate2Test() {
        val firstDupe = day1b2.getFirstDuplicate2(testInputInt)
        Assertions.assertEquals(-1, firstDupe)
    }
}


