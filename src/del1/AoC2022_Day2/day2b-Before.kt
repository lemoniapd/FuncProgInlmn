package del1.AoC2022_Day2

import del1.FileToListConverter

/*
Opponent:
A for Rock, B for Paper, and C for Scissors.

X means you need to lose
Y means you need to end the round in a draw
Z means you need to win

The total score is still calculated in the same way,
but now you need to figure out what shape to choose so the round ends as indicated. The example above now goes like this:

In the first round, your opponent will choose Rock (A), and you need the round to end in a draw (Y), so you also choose Rock. This gives you a score of 1 + 3 = 4.
In the second round, your opponent will choose Paper (B), and you choose Rock so you lose (X) with a score of 1 + 0 = 1.
In the third round, you will defeat your opponent's Scissors with Rock for a score of 1 + 6 = 7.
Now that you're correctly decrypting the ultra top secret strategy guide, you would get a total score of 12.

Rules:
The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).
 */

class Day2b_Before {
    fun getMyScore2(inputList: List<String>): Int {
        var myScore = 0
        for (element in inputList) {
            when (element) {
                "A X" -> myScore += 3
                "A Y" -> myScore += 4
                "A Z" -> myScore += 8
                "B X" -> myScore += 1
                "B Y" -> myScore += 5
                "B Z" -> myScore += 9
                "C X" -> myScore += 2
                "C Y" -> myScore += 6
                "C Z" -> myScore += 7
            }
        }
        return myScore
    }
}


fun main() {
    val fileToListConverter = FileToListConverter()
    val day2b = Day2b_Before()
    val listWithInput = fileToListConverter.listFromInputFileString("src/del1/AoC2022_Day2/actualInput")
    println(day2b.getMyScore2(listWithInput))
}
