fun to_set(str: String): Pair<Set<Char>, Int> {
    val s = str.toSet()
    return Pair(s, s.size)
}

fun to_set(list: List<Int>): Pair<Set<Int>, Int> {
    val s = list.toSet()
    return Pair(s, s.size)
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val (numSet, numPower) = to_set(numbers)
    println("Исходный список: $numbers")
    println("Полученное множество: $numSet")
    println("Мощность множества: $numPower\n")

    val text = "abracadabra"
    val (charSet, charPower) = to_set(text)
    println("Исходная строка: \"$text\"")
    println("Полученное множество: $charSet")
    println("Мощность множества: $charPower")
}
