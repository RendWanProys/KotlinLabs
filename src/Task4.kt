open class Parallelepiped(val length: Double, val width: Double, val height: Double) {
    open fun volume(): Double {
        return length * width * height
    }
}

class MetalBar(
    length: Double,
    width: Double,
    height: Double,
    val density: Double
) : Parallelepiped(length, width, height) {

    fun weight(): Double {
        return volume() * density
    }
}

fun main() {
    print("Введите длину бруса: ")
    val length = readln().toDouble()

    print("Введите ширину бруса: ")
    val width = readln().toDouble()

    print("Введите высоту бруса: ")
    val height = readln().toDouble()

    print("Введите удельный вес (плотность): ")
    val density = readln().toDouble()

    val bar = MetalBar(length, width, height, density)

    println("Объем бруса: ${bar.volume()}")
    println("Вес металлического бруса: ${bar.weight()}")
}
