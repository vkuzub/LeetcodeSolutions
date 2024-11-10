package easy

fun moveZeroes(nums: IntArray) {
    var counter = 0
    for (i in nums.indices.reversed()) {
        val current = nums[i]
        if (current == 0) {
            for (j in i..nums.size - 2) {
                nums[j] = nums[j + 1]
            }
            nums[nums.size - 1 - counter] = 0
            counter++
        }
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(arr)
    println(arr.joinToString())
}