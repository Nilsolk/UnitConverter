fun main() {
    val stroka = readln().split("")
    var cifra = 0
    var temp = ""
    for (i in 1..stroka.size - 2) {
        if (stroka[i] == stroka[i + 1]) {
            cifra++
        } else if (stroka[i] != stroka[i + 1]) {
            cifra++
            temp = temp + "${stroka[i]}" + cifra.toString()
            cifra = 0
        }
    }
    print(temp)
}