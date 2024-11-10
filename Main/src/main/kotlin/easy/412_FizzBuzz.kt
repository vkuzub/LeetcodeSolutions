package easy

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 0..n) {
        result.add(
            when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i.toString()
            }
        )
    }
    return result
}

fun main() {
    println(fizzBuzz(15))
}