package easy

fun reverseString(s: CharArray) {
    s.reverse()
}

fun main() {
    val arr = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString(arr)
    println(arr)
}