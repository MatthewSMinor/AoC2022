object Day3 {
    fun partOne(input: ArrayList<String>) {
        // for each line
        // split line in half
        // find letter that both halves have
        // assign priority to letter
        // add all priorities from all lines
        // return total priority
        var totalPriority = 0
        input.forEach {
            val firstHalf = it.slice(0 until it.length/2).toList()
            val secondHalf = it.slice(it.length/2 until it.length).toList()
            val common = firstHalf.intersect(secondHalf.toSet())
            totalPriority += if (common.first().isLowerCase()) common.first().code-96
            else common.first().code-38
        }
        println(totalPriority)
    }

    fun partTwo(input: ArrayList<String>) {
        // for every three lines
        // find common char in all three
        // add priority of that char to total
        // return total
        var totalPriority = 0
        for(i in 0 until input.size step 3) {
            val first = input[i].toList()
            val second = input[i+1].toList()
            val third = input[i+2].toList()

            val commonAmoungFirstTwo = first.intersect(second.toSet())
            val result = commonAmoungFirstTwo.intersect(third.toSet())
            totalPriority += if (result.first().isLowerCase()) result.first().code-96
            else result.first().code-38
        }
        println(totalPriority)
    }
}