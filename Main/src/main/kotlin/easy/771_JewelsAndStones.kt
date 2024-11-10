package easy

fun numJewelsInStones(jewels: String, stones: String): Int {
    var result = 0
    jewels.forEach { char ->
        result += stones.count { it == char }
    }
    return result
}

fun main() {
    println(numJewelsInStones("aA", "aAAbbbb"))
}