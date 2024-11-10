package easy

fun findNumbers(nums: IntArray): Int {
    val list = nums.map { it.toString().length }
    return list.filter { it % 2 == 0 }.size
}

fun main() {
    println(findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
}