package easy

fun defangIPaddr(address: String): String {
    return address.replace(".", "[.]")
}

fun main() {
    println(defangIPaddr("1.1.1.1"))
}