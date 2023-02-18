package del1.AoC2022_Day2

import del1.FileToListConverter


/*
Opponent:
A for Rock, B for Paper, and C for Scissors.
My column:
X for Rock, Y for Paper, and Z for Scissors.

Rules:
The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).
 */

class Day2a_Before {
    fun getMyScore(inputList: List<String>): Int {
        var myScore = 0
        val roundsMap = inputList.chunked(2)
        for ((key, value) in roundsMap) {
            when (key){
                "A" -> if (value.equals("Z")){
                    myScore += 3
                } else if (value.equals("Y")){
                    myScore += 8
                } else if (value.equals("X")){
                    myScore += 4
                }
                "B" -> if (value.equals("Z")){
                    myScore += 9
                } else if (value.equals("Y")){
                    myScore += 5
                } else if (value.equals("X")){
                    myScore += 1
                }
                "C" -> if (value.equals("Z")){
                    myScore += 6
                } else if (value.equals("Y")){
                    myScore += 3
                } else if (value.equals("X")){
                    myScore += 7
                }
            }
        }
        return myScore
    }
}

fun main() {
    val fileToListConverter = FileToListConverter()
    val day2a = Day2a_Before()
    val listWithInput = fileToListConverter.listFromInputFileNoBlanks("src/del1/AoC2022_Day2/testInput")
    // src/del1/AoC2022_Day2/testInput
    // src/del1/AoC2022_Day2/actualInput
    //val listAsString = listWithInput.joinToString(" ")
    //val result: List<String> = listAsString.split(" ").map { it.trim() }
    println(day2a.getMyScore(listWithInput))
}