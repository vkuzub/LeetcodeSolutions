package easy

fun convertTemperature(celsius: Double): DoubleArray {
    return doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32)
}

fun main() {
    println(convertTemperature(36.50).joinToString())
}