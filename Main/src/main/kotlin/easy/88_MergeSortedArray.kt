package easy

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    nums2.forEachIndexed { index, value ->
        nums1[index + m] = value
    }
    nums1.sort()
}

fun main() {
    val first = intArrayOf(1, 2, 3, 0, 0, 0)
    val second = intArrayOf(2, 5, 6)
    merge(first, 3, second, 3)
    println(first.joinToString())
}