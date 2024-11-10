package easy

fun thirdMax(nums: IntArray): Int {
    if (nums.size >= 3) {
        val sorted = nums.sorted()
        var prev = sorted.last()
        var uniqCounter = 1
        for (i in (0..sorted.size - 2).reversed()) {
            val current = sorted[i]
            if (current != prev) {
                prev = current
                uniqCounter++
            }
            if (uniqCounter == 3) {
                return current
            }
        }
    }

    return nums.max()
}

fun main() {
    println(thirdMax(intArrayOf(2, 2, 3, 1)))
}