package easy

fun lengthOfLastWord(s: String): Int {
    return s.trim().split(" ").last().length
}

fun main() {
    println(lengthOfLastWord("   fly me   to   the moon  "))
}