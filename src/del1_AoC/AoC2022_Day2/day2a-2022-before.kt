package del1_AoC.AoC2022_Day2

import del1_AoC.FileToListConverter

/*
Opponent:
A for Rock, B for Paper, and C for Scissors.
My column:
X for Rock, Y for Paper, and Z for Scissors.

Rules:
The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).
 */

class Day2a_2022_before {
    fun getMyScore(inputList: List<String>): Int {
        var myScore = 0
        for (element in inputList) {
            when (element) {
                "A X" -> myScore += 4
                "A Y" -> myScore += 8
                "A Z" -> myScore += 3
                "B X" -> myScore += 1
                "B Y" -> myScore += 5
                "B Z" -> myScore += 9
                "C X" -> myScore += 7
                "C Y" -> myScore += 2
                "C Z" -> myScore += 6
            }
        }
        return myScore
    }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day2a = Day2a_2022_before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1_AoC/AoC2022_Day2/actualInput")
    println(day2a.getMyScore(listWithInput))
}
