package easy

fun checkIfExist(arr: IntArray): Boolean {
    for (i in arr.indices) {
        val current = arr[i]
        for (j in i + 1..arr.size - 1) {
            val rightToCurrent = arr[j]
            if (current == rightToCurrent * 2 || current * 2 == rightToCurrent) {
                return true
            }
        }
    }
    return false
}

fun main() {
    println(checkIfExist(intArrayOf(10, 2, 5, 3)))
}