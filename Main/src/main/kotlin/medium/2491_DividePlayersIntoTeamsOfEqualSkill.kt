package medium

fun dividePlayers(skill: IntArray): Long {
    skill.sort()

    val firstPairSum = skill.first() + skill.last()
    val halfArraySize = skill.size / 2
    var result = 0L
    var i = 0
    var j = skill.lastIndex
    while (i != halfArraySize) {
        val start = skill[i]
        val end = skill[j]
        val sum = start + end
        if (sum != firstPairSum) {
            return -1
        }
        result += start * end
        i++
        j--
    }
    return result
}

fun main() {
    println(dividePlayers(intArrayOf(3, 2, 5, 1, 3, 4)))
}