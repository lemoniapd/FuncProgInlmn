package del1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    List<String> testInput = fileReader.listFromInputFile("src/Del1/AoC2022_Day1/testInput");
    List<String> listToCompare = Arrays.asList("1000", "2000", "3000", " ", "4000", " ", "5000", "6000", " ", "7000", "8000", "9000", " ", "10000");

    @Test
    public final void listFromInputFileTest() {
        assertEquals(testInput.size(), listToCompare.size());
        assertTrue(testInput.retainAll(listToCompare));
    }
}