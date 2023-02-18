package del1

import java.io.File

class FileToListConverter {
    fun listFromInputFile(path: String): List<String> {
        return File(path).readLines()
    }
}