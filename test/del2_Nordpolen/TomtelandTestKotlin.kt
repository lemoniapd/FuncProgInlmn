package del2_Nordpolen

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class TomtelandTestKotlin

var tomteland = Tomteland()
var underTomten = Arrays.asList(
    "Tröger",
    "Trötter",
    "Blyger",
    "Dammråttan",
    "Skumtomten",
    "Glader",
    "Butter",
    "Rådjuret",
    "Nyckelpigan",
    "Haren",
    "Räven",
    "Gråsuggan",
    "Myran",
    "Bladlusen"
)
var underGlader = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")
var underButter = Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
var underTrötter = Arrays.asList("Dammråttan", "Skumtomten")
var underSkumtomten = Arrays.asList("Dammråttan")
var underRäven = Arrays.asList("Gråsuggan", "Myran", "Bladlusen")
var underMyran = Arrays.asList("Bladlusen")

@Test
fun getUnderlingsOfMyranTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Myran", list)
    assertEquals(underlings.size, underMyran.size)
    //assertFalse(underlings.retainAll(underMyran))
}

@Test
fun getUnderlingsOfRävenTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Räven", list)
    assertEquals(underlings.size, underRäven.size)
    //assertFalse(underlings.retainAll(underRäven))
}

@Test
fun getUnderlingsOfSkumtomtenTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Skumtomten", list)
    assertEquals(underlings.size, underSkumtomten.size)
    //assertFalse(underlings.retainAll(underSkumtomten))
}

@Test
fun getUnderlingsOfTrötterTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Trötter", list)
    assertEquals(underlings.size, underTrötter.size)
    //assertFalse(underlings.retainAll(underTrötter))
}

@Test
fun getUnderlingsOfButterTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Butter", list)
    assertEquals(underlings.size, underButter.size)
    //assertFalse(underlings.retainAll(underButter))
}

@Test
fun getUnderlingsOfGladerTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Glader", list)
    assertEquals(underlings.size, underGlader.size)
    //assertFalse(underlings.retainAll(underGlader))
}

@Test
fun getUnderlingsOfTomtenTest() {
    val list = mutableListOf<String>()
    val underlings = tomteland.getUnderlings("Tomten", list)
    assertEquals(underlings.size, underTomten.size)
    //assertFalse(underlings.retainAll(underTomten))
}