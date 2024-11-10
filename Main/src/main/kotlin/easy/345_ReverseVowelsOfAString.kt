package easy

fun reverseVowels(s: String): String {
    val sb = StringBuilder(s)
    var startIndex = 0
    var endIndex = s.length - 1
    while (startIndex < endIndex) {
        val start = s[startIndex]
        val end = s[endIndex]

        if (!start.isVowel()) {
            startIndex++
            continue
        }

        if (!end.isVowel()) {
            endIndex--
            continue
        }

        sb[startIndex] = end
        sb[endIndex] = start

        startIndex++
        endIndex--
    }
    return String(sb)
}

fun Char.isVowel() =
    this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u' || this == 'A' || this == 'E' || this == 'I' || this == 'O' || this == 'U'

fun main() {
    println(reverseVowels("IceCreAm"))
    println(reverseVowels("ai"))
    println(reverseVowels("aeuUEA"))
    println(reverseVowels("aeUEA"))
}