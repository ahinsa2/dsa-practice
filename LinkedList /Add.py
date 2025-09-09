def addTwoNumbers(l1, l2):
    dummy = ListNode()
    curr = dummy
    carry = 0

    while l1 or l2 or carry:
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0
        total = val1 + val2 + carry
        carry = total // 10
        curr.next = ListNode(total % 10)
        curr = curr.next

        if l1: l1 = l1.next
        if l2: l2 = l2.next

    return dummy.next

# Example
def printList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

l1 = ListNode(2, ListNode(4, ListNode(3)))
l2 = ListNode(5, ListNode(6, ListNode(4)))
printList(addTwoNumbers(l1, l2))  # Output: 7 -> 0 -> 8 -> None
