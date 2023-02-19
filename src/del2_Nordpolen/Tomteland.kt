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

    val underTomten = mapOf(tomten to listOf(butter, glader))
    val underGlader = mapOf(glader to listOf(tröger, trötter, blyger))
    val underButter = mapOf(butter to listOf(rådjuret, nyckelpigan, haren, räven))
    val underTrötter = mapOf(trötter to listOf(skumtomten))
    val underSkumtomten = mapOf(skumtomten to listOf(dammråttan))
    val underRäven = mapOf(räven to listOf(gråsuggan, myran))
    val underMyran = mapOf(myran to listOf(bladlusen))

    fun getUnderlings(input: String, result: MutableList<String>): List<String> {
/*
        fun find(input: String, result: MutableList<String>) : String {
            if (input.equals("")){
                return result
            } else{

            }
        }

        //skriv denna metod, glöm inte att den ska vara rekursiv!
 */
        throw UnsupportedOperationException()
    }
}



//användning av rekursion, mycket bra exempel för att förstå rekursion
fun String.printRepeat2(i: Int): String {
    fun repeat(i: Int, acc: String = "$this"): String {
        if (i < 1) {
            return acc
        } else {
            return repeat(i - 1, "$this $acc")
        }
    }
    return repeat(i - 1)
}



    fun main() {
        val tomteland = Tomteland()
        while (true) {
            println("Vilken Tomte vill du ha underordnade till? X för att avbryta")
            var input = readLine()
            if (input.equals("X") || input.equals("x")) break
            else {
                var result: MutableList<String> = mutableListOf<String>()
                println("$input's underordnade är:")
                println(input?.let { tomteland.getUnderlings(it, result) })
            }
        }
    }
