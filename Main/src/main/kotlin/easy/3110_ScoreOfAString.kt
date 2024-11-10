package easy

import kotlin.math.abs

fun scoreOfString(s: String): Int {
    var result = 0
    var index = 0
    while (index != s.length - 1) {
        result += abs(s[index] - s[index + 1])
        index++
    }
    return result
}

fun main() {
    println(scoreOfString("hello"))
}