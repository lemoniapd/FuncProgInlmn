package del1

import java.io.File

class FileToListConverter {

    fun listFromInputFile(path: String): List<String> {
        val inputStream = File(path).inputStream()
        return inputStream.bufferedReader().readLines()
    }

    fun listFromInputFileNoBlanks(path: String): List<String> {
        val inputStream = File(path).inputStream()
        val listFromInput = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { listFromInput.add(it.replace(" ", ",")) } }
        val inputAsString = listFromInput.joinToString { " " }
        return inputAsString.split(" ").map { it.trim() }
    }
}