package easy

fun isAnagram(s: String, t: String): Boolean {
    val chars = IntArray(26)
    s.forEach {
        val curr = chars[it.index()]
        chars[it.index()] = curr + 1
    }

    t.forEach {
        val curr = chars[it.index()]
        chars[it.index()] = curr - 1
    }

    return !chars.any { it != 0 }
}

fun Char.index() = code - 97

fun main() {
    println(isAnagram("anagram", "nagaram"))
}