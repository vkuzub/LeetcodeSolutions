package easy

fun runningSum(nums: IntArray): IntArray {
    var sum = 0
    nums.forEachIndexed { i, el ->
        sum += el
        nums[i] = sum
    }
    return nums
}

fun main() {
    println(runningSum(intArrayOf(1, 2, 3, 4)).joinToString())
}