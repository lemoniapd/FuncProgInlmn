package del1_AoC

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class FileToListConverterTestKotlin

var fileToListConverter = FileToListConverter()
var testInputString = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/testInput")
var testInputInt = fileToListConverter.listFromInputFileInt("src/del1/AoC2021_Day1/testInput")
var listToCompareString = listOf("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000")
var listToCompareInt = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

@Test
fun listFromInputFileStringTest() {
    assertEquals(testInputString.size, listToCompareString.size)
    //assertTrue(testInputString.retainAll(listToCompareString))
}

@Test
fun listFromInputFileIntTest() {
    assertEquals(testInputInt.size, listToCompareInt.size)
    //assertTrue(testInputInt.retainAll(listToCompareInt));
}