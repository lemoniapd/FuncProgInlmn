package del1

import java.io.File

class FileReader {

    fun listFromInputFile(path: String): List<String> {
        val inputStream = File(path).inputStream()
        return inputStream.bufferedReader().readLines()
    }
}