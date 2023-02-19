package del2_Nordpolen;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TomtelandTest {
    Tomteland tomteland = new Tomteland();
    List<String> underTomten = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen");
    List<String> underGlader = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten");
    List<String> underButter = Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen");
    List<String> underTrötter = Arrays.asList("Dammråttan", "Skumtomten");
    List<String> underSkumtomten = Arrays.asList("Dammråttan");
    List<String> underRäven = Arrays.asList("Gråsuggan", "Myran", "Bladlusen");
    List<String> underMyran = Arrays.asList("Bladlusen");

    @Test
    public final void getUnderlingsOfMyranTest() {
        List<String> list = new ArrayList<>();
        List<String> underlings = tomteland.getUnderlings("Myran", list);
        assertEquals(underlings.size(), underMyran.size());
        assertFalse(underlings.retainAll(underMyran));
    }

    @Test
    public final void getUnderlingsOfRävenTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Räven", list);
        assertEquals(underlings.size(), underRäven.size());
        assertFalse(underlings.retainAll(underRäven));
    }

    @Test
    public final void getUnderlingsOfSkumtomtenTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Skumtomten", list);
        assertEquals(underlings.size(), underSkumtomten.size());
        assertFalse(underlings.retainAll(underSkumtomten));
    }

    @Test
    public final void getUnderlingsOfTrötterTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Trötter", list);
        assertEquals(underlings.size(), underTrötter.size());
        assertFalse(underlings.retainAll(underTrötter));
    }

    @Test
    public final void getUnderlingsOfButterTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Butter", list);
        assertEquals(underlings.size(), underButter.size());
        assertFalse(underlings.retainAll(underButter));
    }

    @Test
    public final void getUnderlingsOfGladerTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Glader", list);
        assertEquals(underlings.size(), underGlader.size());
        assertFalse(underlings.retainAll(underGlader));
    }

    @Test
    public final void getUnderlingsOfTomtenTest() {
        List<String> list = new LinkedList<>();
        List<String> underlings = tomteland.getUnderlings("Tomten", list);
        assertEquals(underlings.size(), underTomten.size());
        assertFalse(underlings.retainAll(underTomten));
    }
}