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
                    'X' -> {
                        4 // rock is 1, draw is 3
                    }
                    'Y' -> {
                        8 // 2+6
                    }
                    'Z' -> {
                        3 // 3+0
                    }
                    else -> {return -1}
                }
            }
            'B' -> {
                when (me) {
                    'X' -> {
                        1 // rock is 1, 0
                    }
                    'Y' -> {
                        5 // 2+ 3
                    }
                    'Z' -> {
                        9 // 3+6
                    }
                    else -> {return -1}
                }
            }
            'C' -> {
                when (me) {
                    'X' -> {
                        7 // 1+6
                    }
                    'Y' -> {
                        2 // 2 + 0
                    }
                    'Z' -> {
                        6 // 3 + 3
                    }

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
                    'Y' -> 4
                    'X' -> 3
                    'Z' -> 8 // 2+6
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