import java.math.BigInteger

fun getSum(n: Int): BigInteger {
    val ones = "1".repeat(n).toBigInteger()
    val pow5 = BigInteger.valueOf(5).pow(n + 1)
    return pow5.multiply(ones)
}

fun countEven(num: BigInteger): Int {
    val evenDigits = setOf('0', '2', '4', '6', '8')
    return num.toString().count { it in evenDigits }
}

fun main() {
    print("Введите n: ")
    val n = readln().toInt()

    val sum = getSum(n)
    val count = countEven(sum)

    println("Сумма: $sum")
    println("Количество четных цифр: $count")
}