package Del1;

import Del1.AoC2022_Day1.Day1a_Before;
import Del1.AoC2022_Day1.Day1b_Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day1Test {
    FileReader fileReader = new FileReader();
    List<String> testInput = fileReader.listFromInputFile("src/Del1/AoC2022_Day1/testInput");
    Day1a_Before day1a = new Day1a_Before();
    Day1b_Before day1b = new Day1b_Before();


    @Test
    public final void listFromInputFileTest() {
        List<String> listToCompare = Arrays.asList("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000");
        assertEquals(testInput.size(), listToCompare.size());
        assertTrue(testInput.retainAll(listToCompare));
    }

    @Test
    public final void getHighestSumValueFromInputListTest(){
        int highestTestValue = day1a.getHighestSumValueFromInputList(testInput);
        assertEquals(highestTestValue, 24000);
    }

    @Test
    public final void getHighestThreeSumValueFromInputListTest(){
        int highestThreeTestValues = day1b.getHighestThreeSumValueFromInputList(testInput);
        assertEquals(highestThreeTestValues, 41000);
    }
}