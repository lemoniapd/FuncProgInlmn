package del2_Nordpolen

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class TomtelandTestKotlin {

    var tomteland = Tomteland()
    var underTomten = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
    var underGlader = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")
    var underButter = Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
    var underTrötter = Arrays.asList("Dammråttan", "Skumtomten")
    var underSkumtomten = Arrays.asList("Dammråttan")
    var underRäven = Arrays.asList("Gråsuggan", "Myran", "Bladlusen")
    var underMyran = Arrays.asList("Bladlusen")

    @Test
    fun getUnderlingsOfMyranTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.myran, list)
        assertEquals(underlings.size, underMyran.size)
    }

    @Test
    fun getUnderlingsOfRävenTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.räven, list)
        assertEquals(underlings.size, underRäven.size)
    }

    @Test
    fun getUnderlingsOfSkumtomtenTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.skumtomten, list)
        assertEquals(underlings.size, underSkumtomten.size)
    }

    @Test
    fun getUnderlingsOfTrötterTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.trötter, list)
        assertEquals(underlings.size, underTrötter.size)
    }

    @Test
    fun getUnderlingsOfButterTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.butter, list)
        assertEquals(underlings.size, underButter.size)
    }

    @Test
    fun getUnderlingsOfGladerTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.glader, list)
        assertEquals(underlings.size, underGlader.size)
    }

    @Test
    fun getUnderlingsOfTomtenTest() {
        val list = mutableListOf<String>()
        val underlings = tomteland.getUnderlings(tomte = tomteland.tomten, list)
        assertEquals(underlings.size, underTomten.size)
    }
}