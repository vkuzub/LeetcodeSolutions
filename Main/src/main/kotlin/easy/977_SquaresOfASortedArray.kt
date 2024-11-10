package easy

fun sortedSquares(nums: IntArray): IntArray {
    nums.forEachIndexed { index, i ->
        nums[index] = i * i
    }
    var needsMoreSort = true
    while (needsMoreSort) {
        needsMoreSort = nums.bubbleSort()
    }
    return nums
}

fun IntArray.bubbleSort(): Boolean {
    var sorted = false
    var last = first()
    for (i in 1..<size) {
        val current = get(i)
        if (current < last) {
            this[i - 1] = current
            this[i] = last
            sorted = true
        } else {
            last = current
        }
    }
    return sorted
}

fun main() {
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).joinToString())
}