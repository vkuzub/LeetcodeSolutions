package easy

fun reverseStr(s: String, k: Int): String {
    val words = mutableListOf<String>()
    val limited = s.limit(k)
    if (limited.size <= 1) return limited.first().reversed()

    for (i in limited.indices) {
        val word = limited[i]
        if (i % 2 == 0) {
            words.add(word.reversed())
        } else {
            words.add(word)
        }
    }
    return words.joinToString(separator = "")
}

fun String.limit(k: Int): List<String> {
    val list = mutableListOf<String>()
    var word = ""
    for (i in indices) {
        word += get(i)
        if (word.length == k) {
            list.add(word)
            word = ""
        }
    }
    list.add(word)
    return list
}

fun main() {
    println(
        reverseStr(
            "krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc",
            20
        )
    )
    println(reverseStr("abcdefg", 4))
}