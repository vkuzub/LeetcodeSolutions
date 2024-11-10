package easy

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun middleNode(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

fun main() {
    val head = ListNode(1).apply {
        next = ListNode(2)
            .apply {
                next = ListNode(3)
                    .apply {
                        next = ListNode(4)
                            .apply { next = ListNode(5) }
                    }
            }
    }
    println(middleNode(head)?.`val`)
}