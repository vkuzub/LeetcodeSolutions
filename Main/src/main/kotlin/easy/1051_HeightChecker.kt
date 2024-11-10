package easy

fun heightChecker(heights: IntArray): Int {
    var result = 0
    val sortedList = heights.copyOf()
    mergeSort(sortedList)

    sortedList.forEachIndexed { i, cur ->
        val height = heights[i]
        if (height != cur) {
            result++
        }
    }
    return result
}

fun mergeSort(arr: IntArray) {
    val middle = arr.size / 2
    val leftArr = IntArray(middle)
    val rightArr = IntArray(arr.size - leftArr.size)

    if (arr.size < 2) {
        return
    }

    for (i in 0..<middle) {
        leftArr[i] = arr[i]
    }

    for (i in middle..<arr.size) {
        rightArr[i - middle] = arr[i]
    }

    mergeSort(leftArr)
    mergeSort(rightArr)

    mergeArr(leftArr, rightArr, arr)
}

fun mergeArr(left: IntArray, right: IntArray, result: IntArray) {
    var i = 0
    var j = 0
    var k = 0

    while (i != left.size && j != right.size) {
        if (left[i] <= right[j]) {
            result[k] = left[i]
            i++
        } else {
            result[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        result[k] = left[i]
        k++
        i++
    }

    while (j < right.size) {
        result[k] = right[j]
        k++
        j++
    }
}

fun main() {
    println(heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
}