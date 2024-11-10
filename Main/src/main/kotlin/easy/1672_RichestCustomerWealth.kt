package easy

fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.maxOfOrNull { it.sum() } ?: 0
}

fun main() {
    println(maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))))
}