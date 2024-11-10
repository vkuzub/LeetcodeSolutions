package easy

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    (1..nums.size).forEach { cur ->
        if (!nums.contains(cur)) {
            result.add(cur)
        }
    }
    return result
}

fun main() {
    println(findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 3, 1)))
}