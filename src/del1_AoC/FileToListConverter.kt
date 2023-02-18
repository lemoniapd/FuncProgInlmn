package del1_AoC

import java.io.File

class FileToListConverter {
    fun listFromInputFileString(path: String): List<String> {
        return File(path).readLines()
    }
    fun listFromInputFileInt(path: String): List<Int> {
        val stringList = File(path).readLines()
        return stringList.map { it.toInt() }
    }
}