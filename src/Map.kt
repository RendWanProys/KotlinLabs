fun main() {
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

    println("Словарь-матрешка:")
    println(matryoshka)

    val step1 = matryoshka["10"] as Map<*, *>
    val step2 = step1["3.14"] as Map<*, *>
    val step3 = step2["1+2i"] as Map<*, *>
    val step4 = step3["[]"] as Map<*, *>
    val finalString = step4["(1,)"]

    println("\nКонечная строка: $finalString")
}
