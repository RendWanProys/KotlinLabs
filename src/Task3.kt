fun solveEquation(a: Double, b: Double, c: Double): String {
    return when {
        a == 0.0 && (c - b) == 0.0 -> "Уравнение имеет бесконечно много решений"
        a == 0.0 -> "Уравнение не имеет решений"
        else -> {
            val x = (c - b) / a
            "Корень уравнения x = $x"
        }
    }
}

fun main() {
    print("Введите коэффициент a: ")
    val a = readln().toDouble()

    print("Введите коэффициент b: ")
    val b = readln().toDouble()

    print("Введите число c: ")
    val c = readln().toDouble()

    println(solveEquation(a, b, c))
}
