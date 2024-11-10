package easy

tailrec fun numberOfSteps(num: Int, count: Int = 0): Int {
    if (num == 0) return count
    return when {
        num % 2 == 0 -> numberOfSteps(num / 2, count + 1)
        num % 2 == 1 -> numberOfSteps(num - 1, count + 1)
        else -> count
    }
}

fun main() {
    println(numberOfSteps(14))
}