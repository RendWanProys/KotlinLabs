import java.time.Year

open class House(
    val houseNumber: Int,
    val apartmentsCount: Int,
    val buildYear: Int
) {
    open fun calculateQ(currentYear: Int = Year.now().value): Double {
        return apartmentsCount + 2.0 * (currentYear - buildYear)
    }

    open fun printInfo(currentYear: Int = Year.now().value) {
        println("Номер дома: $houseNumber")
        println("Количество квартир: $apartmentsCount")
        println("Год постройки: $buildYear")
        println("Качество Q: ${calculateQ(currentYear)}")
    }
}

class HouseWithDistrict(
    houseNumber: Int,
    apartmentsCount: Int,
    buildYear: Int,
    val district: String
) : House(houseNumber, apartmentsCount, buildYear) {

    fun calculateQp(currentYear: Int = Year.now().value): Double {
        val q = calculateQ(currentYear)
        return if (district.trim().contains("центр", ignoreCase = true)) {
            2.0 * q
        } else {
            0.5 * q
        }
    }

    override fun printInfo(currentYear: Int) {
        super.printInfo(currentYear)
        println("Район: $district")
        println("Качество с учетом района (Qp): ${calculateQp(currentYear)}")
    }
}

fun main() {
    print("Введите номер дома: ")
    val number = readln().trim().toInt()

    print("Введите количество квартир: ")
    val apartments = readln().trim().toInt()

    print("Введите год сооружения: ")
    val year = readln().trim().toInt()

    print("Введите район (например: центр, окраина): ")
    val district = readln().trim()

    val house = HouseWithDistrict(number, apartments, year, district)

    println("\n--- Информация об объекте ---")
    house.printInfo()
}
