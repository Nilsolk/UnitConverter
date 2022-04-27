fun main() {
    val input = readln().split(" ")
    val text = input[0]
    val move = input[1].toInt()

    if (text.length >= move && move > 0) {
        val new = text.substring(move)
        println(new.plus(input[0].replace(new, " ")))
    } else {
        println(text)
    }
}