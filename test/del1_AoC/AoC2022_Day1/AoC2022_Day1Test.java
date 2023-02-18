package del1_AoC.AoC2022_Day1;

import del1_AoC.FileToListConverter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoC2022_Day1Test {
    FileToListConverter fileToListConverter = new FileToListConverter();
    List<String> testInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/testInput");
    Day1a_2022_before day1a = new Day1a_2022_before();
    Day1b_2022_before day1b = new Day1b_2022_before();


    @Test
    public final void listFromInputFileTest() {
        List<String> listToCompare = Arrays.asList("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000");
        assertEquals(testInput.size(), listToCompare.size());
        assertTrue(testInput.retainAll(listToCompare));
    }

    //1a
    @Test
    public final void getHighestSumValueFromInputListTest(){
        int highestTestValue = day1a.getHighestSumValueFromInputList(testInput);
        assertEquals(24000, highestTestValue);
    }

    //1b
    @Test
    public final void getHighestThreeSumValueFromInputListTest(){
        int highestThreeTestValues = day1b.getHighestThreeSumValueFromInputList(testInput);
        assertEquals(41000, highestThreeTestValues);
    }
}