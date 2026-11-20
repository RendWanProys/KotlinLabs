import kotlin.math.sqrt

fun getVolume(a: Double, b: Double, c: Double): Double {
    return a * b * c
}

fun getDiagonal(a: Double, b: Double, c: Double): Double {
    return sqrt(a * a + b * b + c * c)
}

fun main() {
    print("Введите длину стороны a: ")
    val a = readln().toDouble()

    print("Введите длину стороны b: ")
    val b = readln().toDouble()

    print("Введите длину стороны c: ")
    val c = readln().toDouble()

    val volume = getVolume(a, b, c)
    val diagonal = getDiagonal(a, b, c)

    println("Объем параллелепипеда: $volume")
    println("Длина наибольшей диагонали: $diagonal")
}
