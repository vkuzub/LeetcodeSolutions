package easy

fun removeDuplicates(nums: IntArray): Int {
    var currentNum = nums.first()
    var writePointer = 1
    for (i in 1..<nums.size) {
        val current = nums[i]
        if (current != currentNum) {
            currentNum = current
            nums[writePointer] = current
            writePointer++
        }
    }
    return writePointer
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}