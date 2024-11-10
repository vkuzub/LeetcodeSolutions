package easy

fun sortArrayByParity(nums: IntArray): IntArray {
    for (i in nums.indices) {
        val current = nums[i]
        if (current % 2 == 1) {
            for (j in (i..<nums.size).reversed()) {
                val end = nums[j]
                if (end % 2 == 0) {
                    nums[i] = end
                    nums[j] = current
                    break
                }
            }
        }
    }

    return nums
}

fun main() {
    val arr = intArrayOf(3, 1, 2, 4)
    println(sortArrayByParity(arr).joinToString())
}