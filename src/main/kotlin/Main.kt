import java.io.File

fun main() {
//    val dayOneInputFile = "src/main/kotlin/d1Input.txt"
//    val input = AocFileReader.storeInputInArray(dayOneInputFile)
//    println(input)
//
//    var day1Result = Day1.partOne(input)
//    Day1.partTwo(day1Result)

    val dayThreeInputFile = "src/main/kotlin/d3Input.txt"
    val dayThreeInput = AocFileReader.readDayThreeInput(dayThreeInputFile)
    Day3.partTwo(dayThreeInput)
}

