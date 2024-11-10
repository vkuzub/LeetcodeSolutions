package easy

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val letterMap = magazine.groupingBy { it }.eachCount().toMutableMap()
    ransomNote.forEach { letter ->
        if (letterMap.containsKey(letter)) {
            val amount = letterMap[letter] ?: 0
            if (amount <= 0) {
                return false
            }
            letterMap[letter] = amount - 1
        } else {
            return false
        }
    }

    return true
}

fun main() {
    println(canConstruct("aa", "aab"))
}