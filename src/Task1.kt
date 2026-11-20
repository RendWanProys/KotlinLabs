fun sumOfSquares(a: Double, b: Double): Double {
    return a * a + b * b
}

fun main() {
    print("Введите вещественное число a: ")
    val a = readln().toDouble()

    print("Введите вещественное число b: ")
    val b = readln().toDouble()

    val result = sumOfSquares(a, b)
    println("Сумма квадратов a^2 + b^2 = $result")
}
