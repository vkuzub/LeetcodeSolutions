package easy

fun numIdenticalPairs(nums: IntArray): Int {
    var result = 0
    for (i in 0..nums.size - 2) {
        for (j in i + 1..<nums.size) {
            if (nums[i] == nums[j]) {
                result++
            }
        }
    }
    return result
}

fun main() {
    println(numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
}