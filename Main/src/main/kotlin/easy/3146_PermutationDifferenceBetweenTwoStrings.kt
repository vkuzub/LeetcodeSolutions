package easy

import kotlin.math.abs

fun findPermutationDifference(s: String, t: String): Int {
    var result = 0
    s.forEachIndexed { index, c ->
        if (c != t[index]) {
            result += abs(index - t.indexOf(c))
        }
    }
    return result
}

fun main() {
    println(findPermutationDifference("abcde", "edbac"))
}