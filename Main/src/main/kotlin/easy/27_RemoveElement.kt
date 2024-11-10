package easy

fun removeElement(nums: IntArray, `val`: Int): Int {
    nums.moveToEnd(`val`)
    var count = 0
    for (i in nums.indices.reversed()) {
        if (nums[i] == `val`) {
            count++
        } else {
            break
        }
    }
    return nums.size - count
}

private fun IntArray.moveToEnd(el: Int) {
    for (i in indices) {
        if (get(i) == el) {
            for (j in indices.reversed()) {
                if (i >= j) return

                if (get(j) == el) {
                    continue
                } else {
                    val lastUnique = get(j)
                    set(i, lastUnique)
                    set(j, el)
                    break
                }
            }
        }
    }
}

fun main() {
    println(removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}