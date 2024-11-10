package easy

fun duplicateZeros(arr: IntArray) {
    val indexesOfZeros = mutableListOf<Int>()
    for (i in arr.indices.reversed()) {
        if (arr[i] == 0) indexesOfZeros.add(i)
    }
    indexesOfZeros.forEach { index ->
        arr.insert(index, 0)
    }
}

private fun IntArray.insert(index: Int, value: Int) {
    for (i in (index..size - 2).reversed()) {
        this[i + 1] = this[i]
    }
    this[index] = value
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
    duplicateZeros(arr)
    println(arr.joinToString())
}