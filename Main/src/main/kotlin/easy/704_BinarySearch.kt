package easy

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val middleIndex = (left + right) / 2
        val middleEl = nums[middleIndex]

        if (middleEl == target) {
            return middleIndex
        }

        if (middleEl > target) {
            right = middleIndex - 1 //searching in left part
        } else {
            left = middleIndex + 1 //searching in right part
        }
    }
    return -1
}

fun searchRecursive(arr: IntArray, element: Int, startIndex: Int, endIndex: Int): Int {
    if (startIndex > endIndex) {
        return -1
    }
    val middleIndex = (startIndex + endIndex) / 2
    val centerElement = arr[middleIndex]
    return when {
        centerElement == element -> middleIndex
        centerElement > element -> searchRecursive(arr, element, startIndex, middleIndex - 1) //left
        centerElement < element -> searchRecursive(arr, element, middleIndex + 1, endIndex) //right
        else -> -1
    }
}

fun main() {
    val arr = intArrayOf(-1, 0, 3, 5, 9, 12)
    println(search(arr, 9))
    println(searchRecursive(arr, 9, 0, arr.size - 1))
}