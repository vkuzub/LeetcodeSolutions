package medium

fun sortColors(nums: IntArray): Unit {
    var startIndex = 0
    var middleIndex = 0
    var endIndex = nums.size - 1

    while(middleIndex<=endIndex) {
        val current = nums[middleIndex]

        when{
            current == 1 -> middleIndex++
            current > 1 -> {
                nums[middleIndex] = nums[endIndex]
                nums[endIndex] = current

                endIndex--
            }
            current<1 -> {
                nums[middleIndex] = nums[startIndex]
                nums[startIndex] = current

                startIndex++
                middleIndex++
            }
        }
    }
}

fun main() {
    val array = intArrayOf(2, 1, 0, 1, 1, 2, 0, 2, 1, 1, 0)
    sortColors(array)
    println(array.joinToString())
}