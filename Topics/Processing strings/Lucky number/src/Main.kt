fun main() {
    val x = readln()
    val num1 = x.substring(0, x.length / 2)
    val num2 = x.substring(x.length / 2)
    var sum1 = 0
    var sum2 = 0
    for (i in 0 until x.length / 2) {
        sum1 += num1[i].digitToInt()
        sum2 += num2[i].digitToInt()
    }
    if (sum1 == sum2) println("YES") else println("NO")
}