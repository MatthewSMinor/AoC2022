object Day3 {
    fun partOne(input: ArrayList<String>) {
        // for each line
        // split line in half
        // find letter that both halves have
        // assign priority to letter
        // add all priorities from all lines
        // return total priority
        var totalPriority = 0
        loop@ input.forEach {
            var firstHalf = it.slice(0 until it.length/2).toList()
            var secondHalf = it.slice(it.length/2 until it.length).toList()
            var common = firstHalf.intersect(secondHalf.toSet())
            totalPriority += if (common.first().isLowerCase()) common.first().code-96
            else common.first().code-38
        }
        println(totalPriority)
    }
}