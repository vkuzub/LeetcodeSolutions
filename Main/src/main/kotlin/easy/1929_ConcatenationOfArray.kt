package easy

fun getConcatenation(nums: IntArray): IntArray {
    return nums + nums
}

fun main() {
    println(getConcatenation(intArrayOf(1, 2, 1)).joinToString())
}