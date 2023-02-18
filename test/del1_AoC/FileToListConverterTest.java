package del1_AoC;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileToListConverterTest {
    FileToListConverter fileToListConverter = new FileToListConverter();
    List<String> testInputString = fileToListConverter.listFromInputFileString("src/Del1/AoC2022_Day1/testInput");
    List<Integer> testInputInt = fileToListConverter.listFromInputFileInt("src/del1/AoC2021_Day1/testInput");
    List<String> listToCompareString = Arrays.asList("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000");
    List<Integer> listToCompareInt = Arrays.asList(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);

    @Test
    public final void listFromInputFileStringTest() {
        assertEquals(testInputString.size(), listToCompareString.size());
        assertTrue(testInputString.retainAll(listToCompareString));
    }

    @Test
    public final void listFromInputFileIntTest() {
        assertEquals(testInputInt.size(), listToCompareInt.size());
        //assertTrue(testInputInt.retainAll(listToCompareInt));
    }
}