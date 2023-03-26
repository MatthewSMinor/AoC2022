import java.io.File

object Day2 {
    // Rock = A, X == 1
    // Paper = B, Y == 2
    // Scissors = C, Z == 3
    // Win = 6
    // Draw = 3
    // Loss = 0
    fun partOne() {
        var totalScore = 0
        File("src/main/kotlin/d2Input.txt").forEachLine {
            it.split(" ")
            var result = pointsForPlay(it[0], it[2])
            totalScore += result
        }
        println(totalScore)
    }

    fun partTwo() {
        var totalScore = 0
        File("src/main/kotlin/d2Input.txt").forEachLine {
            var result = pointsForPlayPartTwo(it[0], it[2])
            totalScore += result
        }
        println(totalScore)
    }

    private fun pointsForPlay(opp: Char, me: Char): Int {
        return when (opp) {
            'A' -> {
                when (me) {
                    'X' -> 4
                    'Y' -> 8
                    'Z' -> 3
                    else -> {return -1}
                }
            }
            'B' -> {
                when (me) {
                    'X' -> 1
                    'Y' -> 5
                    'Z' -> 9
                    else -> {return -1}
                }
            }
            'C' -> {
                when (me) {
                    'X' -> 7
                    'Y' -> 2
                    'Z' -> 6

                    else -> {return -1}
                }
            }
            else -> {return -1}
        }
    }

    private fun pointsForPlayPartTwo(opp: Char, me:Char): Int {
        var paper = 2
        var rock = 1
        var scissors = 3
        var win = 6
        var draw = 3
        var lose = 0
        return when (opp) {
            'A' -> {
                when (me) {
                    'Y' -> draw+rock
                    'X' -> scissors+lose
                    'Z' -> paper+win
                    else -> -1
                }
            }
            'B' -> {
                when (me) {
                    'Y' -> paper+draw
                    'X' -> rock+lose
                    'Z' -> win+scissors
                    else -> -1
                }
            }
            'C' -> {
                when (me) {
                    'Y' -> draw+scissors
                    'X' -> lose+paper
                    'Z' -> win+rock
                    else -> -1
                }
            }
            else -> -1
        }
    }

}