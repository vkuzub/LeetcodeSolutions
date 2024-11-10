package easy

fun minimumOperations(nums: IntArray): Int {
    var amount = 0
    val temp = ArrayList<Int>(nums.size)
    while (true) {
        nums.forEachIndexed { index, num ->
            if (num % 3 == 0) {
                temp.add(index, num)
            } else if (num % 3 == 2) {
                temp.add(index, num + 1)
                amount++
            } else if (num % 3 == 1) {
                temp.add(index, num - 1)
                amount++
            }
        }
        if (temp.sum() % 3 == 0) {
            break
        }
    }
    return amount
}

fun main() {
    println(minimumOperations(intArrayOf(1, 2, 3, 4)))
}