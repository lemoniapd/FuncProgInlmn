package del1.AoC2022_Day2;

import del1.FileToListConverter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoC2022_Day2Test {
    FileToListConverter fileToListConverter = new FileToListConverter();
    List<String> testInput = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day2/testInput");
    Day2a_Before day2a = new Day2a_Before();
    Day2b_Before day2b = new Day2b_Before();


    @Test
    public final void listFromInputFileTest() {
        List<String> listToCompare = Arrays.asList("A Y", "B X", "C Z");
        assertEquals(listToCompare.size(), testInput.size());
        // assertTrue(testInput.retainAll(listToCompare));
    }

    @Test
    public final void getMyScoreTest(){
        int myScore = day2a.getMyScore(testInput);
        assertEquals(15, myScore);
    }

    @Test
    public final void getMyScore2Test(){
        int myScore = day2b.getMyScore2(testInput);
        assertEquals(12, myScore);
    }
}