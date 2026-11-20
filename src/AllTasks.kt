fun removeDuplicates(numbers: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (item in numbers) {
        if (item !in result) {
            result.add(item)
        }
    }
    return result
}

fun to_set(str: String): Pair<Set<Char>, Int> {
    val s = str.toSet()
    return Pair(s, s.size)
}

fun to_set(list: List<Int>): Pair<Set<Int>, Int> {
    val s = list.toSet()
    return Pair(s, s.size)
}

fun main() {
    println("=== ЗАДАНИЕ 1 (LIST) ===")
    val originalList = listOf(1, 2, 2, 3, 4, 4, 5, 5, 5, 6)
    println("Исходный список: $originalList")
    println("Без дубликатов:  ${removeDuplicates(originalList)}\n")

    println("=== ЗАДАНИЕ 2 (SET) ===")
    val (setNum, powerNum) = to_set(listOf(1, 2, 2, 3, 4, 4, 5))
    println("Множество чисел: $setNum, мощность: $powerNum")

    val (setText, powerText) = to_set("abracadabra")
    println("Множество строки: $setText, мощность: $powerText\n")

    println("=== ЗАДАНИЕ 3 (MAP) ===")
    val matryoshka: Map<String, Any> = mapOf(
        "10" to mapOf(
            "3.14" to mapOf(
                "1+2i" to mapOf(
                    "[]" to mapOf(
                        "(1,)" to "Ok!"
                    )
                )
            )
        )
    )
    println("Словарь: $matryoshka")
    val step1 = matryoshka["10"] as Map<*, *>
    val step2 = step1["3.14"] as Map<*, *>
    val step3 = step2["1+2i"] as Map<*, *>
    val step4 = step3["[]"] as Map<*, *>
    val finalString = step4["(1,)"]
    println("Конечная строка: $finalString")
}
