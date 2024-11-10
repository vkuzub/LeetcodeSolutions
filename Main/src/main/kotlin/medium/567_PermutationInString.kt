package medium

fun checkInclusion(s1: String, s2: String): Boolean {
    val windowLength = s1.length
    val window = StringBuilder()
    for (i in s2.indices) {
        val curr = s2[i]
        window.append(curr)

        if (window.length == windowLength) {
            val windows = mutableMapOf<Char, Int>()
            for (j in window.indices) {
                val windowCurr = window[j]
                val count = windows[windowCurr] ?: 0
                windows[windowCurr] = count + 1
            }

            s1.forEach {
                val amount = windows[it] ?: 0
                windows[it] = amount - 1
            }

            if (windows.values.any { it < 0 }) {
                window.delete(0, 1)
            } else {
                return true
            }
        }
    }

    return false
}

fun main() {
    println(checkInclusion("ccc", "cbac"))
    println(checkInclusion("ab", "eidbaooo"))
}