package del1;

import del1.AoC2022_Day2.Day2a_Before;
import del1.AoC2022_Day2.Day2b_Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day2Test {
    FileToListConverter fileToListConverter = new FileToListConverter();
    List<String> testInput = fileToListConverter.listFromInputFile("src/Del1/AoC2022_Day2/testInput");
    Day2a_Before day2a = new Day2a_Before();
    Day2b_Before day2b = new Day2b_Before();


    @Test
    public final void listFromInputFileTest() {
        List<String> listToCompare = Arrays.asList("A", "Y", "B", "X", "C", "Z");
        assertEquals(listToCompare.size(), testInput.size());
        assertTrue(testInput.retainAll(listToCompare));
    }

    @Test
    public final void getMyScoreTest(){
        List<String> listToCompare = Arrays.asList("A", "Y", "B", "X", "C", "Z");
        //int myScore = day2a.getMyScore(testInput);
        int myScore = day2a.getMyScore(listToCompare);
        assertEquals(15, myScore);
    }

    /*
    @Test
    public final void getHighestThreeSumValueFromInputListTest(){
        int highestThreeTestValues = day1b.getHighestThreeSumValueFromInputList(testInput);
        assertEquals(highestThreeTestValues, 41000);
    }

 */
}