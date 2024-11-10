package easy

fun finalValueAfterOperations(operations: Array<String>): Int {
    var result = 0
    operations.forEach { op ->
        when (op) {
            "++X", "X++" -> result++
            "--X", "X--" -> result--
        }
    }
    return result
}

fun main() {
    println(finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
}