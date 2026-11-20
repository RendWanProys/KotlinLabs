fun removeDuplicates(numbers: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (item in numbers) {
        if (item !in result) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    println("Введите элементы списка через пробел (например: 1 2 2 3 4 4 5):")
    val input = readln().replace("\uFEFF", "").trim()
    val list = if (input.isEmpty()) {
        listOf(1, 2, 2, 3, 4, 4, 5)
    } else {
        input.split("\\s+".toRegex()).map { it.filter { c -> c.isDigit() || c == '-' }.toInt() }
    }

    println("Исходный список: $list")
    val uniqueList = removeDuplicates(list)
    println("Список без дубликатов: $uniqueList")
}
