import java.io.File

object AocFileReader {
    fun storeInputInArray(inputFile: String) : ArrayList<Int> {
        var arr = ArrayList<Int>()
        File(inputFile).forEachLine {
            arr.add(if (it == "") -1 else it.toInt())
        }

        return arr;
    }

    fun readDayThreeInput(inputFile: String): ArrayList<String> {
        var arr = ArrayList<String>()
        File(inputFile).forEachLine {
            arr.add(it)
        }
        return arr
    }
}