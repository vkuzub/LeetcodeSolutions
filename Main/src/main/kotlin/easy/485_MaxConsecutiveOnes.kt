package easy

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    val list = nums.joinToString(separator = "").split('0').sortedDescending()
    return list.first().length
}

fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
}