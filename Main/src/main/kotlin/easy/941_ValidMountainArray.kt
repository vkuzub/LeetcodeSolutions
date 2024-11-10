package easy

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) return false
    var peakIndex = 0
    var previous = arr[0]
    for (i in 1..arr.size - 1) {
        val current = arr[i]
        if (current > previous) {
            previous = current
            peakIndex = i
        } else {
            break
        }
    }
    if (peakIndex == 0 || peakIndex == arr.lastIndex) return false
    previous = arr[0]
    for (i in 1..peakIndex) {
        val current = arr[i]
        if (current > previous) {
            previous = current
        } else {
            return false
        }
    }
    previous = arr[peakIndex]
    for (i in peakIndex + 1..arr.size - 1) {
        val current = arr[i]
        if (current < previous) {
            previous = current
        } else {
            return false
        }
    }

    return true
}

fun main() {
    println(validMountainArray(intArrayOf(0, 3, 2, 1)))
}