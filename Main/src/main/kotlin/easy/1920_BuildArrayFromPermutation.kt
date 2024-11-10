package easy

fun buildArray(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    for (i in nums.indices) {
        arr[i] = nums[nums[i]]
    }
    return arr
}

fun main() {
    println(buildArray(intArrayOf(0, 2, 1, 5, 3, 4)).joinToString())
}