package easy

fun replaceElements(arr: IntArray): IntArray {
    if (arr.size <= 1) return intArrayOf(-1)

    for (i in 0..arr.size - 2) {
        val max = arr.findMax(i + 1)
        arr[i] = max
    }
    arr[arr.size - 1] = -1
    return arr
}

fun IntArray.findMax(startPos: Int): Int {
    var max = get(startPos)
    for (i in startPos..<size) {
        val current = get(i)
        if (current > max) {
            max = current
        }
    }
    return max
}

fun main() {
    println(replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)).joinToString())
}