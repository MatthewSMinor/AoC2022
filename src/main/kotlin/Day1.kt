object Day1 {
    fun partOne(input: ArrayList<Int>): ArrayList<Int> {
        var arr = ArrayList<Int>()

        var total = 0
        for (i in 0 until input.size) {
            if (input[i] != -1) {
                total += input[i]
            }
            else {
                arr.add(total)
                total = 0
            }
        }

        println(arr.max())
        return arr
    }

    fun partTwo(input: ArrayList<Int>) {
        var total = 0
        for (i in 1..3) {
            var currentMax = input.max()
            total += currentMax
            input.remove(currentMax)
        }

        println(total)
    }

}