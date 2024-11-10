package easy

fun getSneakyNumbers(nums: IntArray): IntArray {
    return nums.groupBy { it }.filter { it.value.size == 2 }.keys.toIntArray()
}

fun main() {
    println(getSneakyNumbers(intArrayOf(0, 1, 1, 0)).joinToString())
}