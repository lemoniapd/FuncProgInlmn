package del2_Nordpolen

class Tomteland {

    val tomten = Tomte("Tomten")
    val glader = Tomte("Glader")
    val butter = Tomte("Butter")
    val tröger = Tomte("Tröger")
    val trötter = Tomte("Trötter")
    val blyger = Tomte("Blyger")
    val rådjuret = Tomte("Rådjuret")
    val nyckelpigan = Tomte("Nyckelpigan")
    val haren = Tomte("Haren")
    val räven = Tomte("Räven")
    val skumtomten = Tomte("Skumtomten")
    val dammråttan = Tomte("Dammråttan")
    val gråsuggan = Tomte("Gråsuggan")
    val myran = Tomte("Myran")
    val bladlusen = Tomte("Bladlusen")

    val underTomten = listOf(butter, glader)
    val underGlader = listOf(tröger, trötter, blyger)
    val underButter = listOf(rådjuret, nyckelpigan, haren, räven)
    val underTrötter = listOf(skumtomten)
    val underSkumtomten = listOf(dammråttan)
    val underRäven = listOf(gråsuggan, myran)
    val underMyran = listOf(bladlusen)

    fun getUnderlings(tomte: Tomte, result: MutableList<String>): List<String> {
        mappingUnderlings()
        for (element in tomte.underlings){
            result.add(element.name)
            getUnderlings(element, result)
        }
        return result
    }

    fun mappingUnderlings(){
        tomten.underlings = underTomten
        glader.underlings = underGlader
        butter.underlings = underButter
        trötter.underlings = underTrötter
        räven.underlings = underRäven
        skumtomten.underlings = underSkumtomten
        myran.underlings = underMyran
    }
}

fun main() {
    val tomteland = Tomteland()
    val result = mutableListOf<String>()
    println(tomteland.getUnderlings(tomteland.räven, result))
}