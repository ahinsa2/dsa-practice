def mergeTwoLists(list1, list2):
    dummy = ListNode()
    tail = dummy

    while list1 and list2:
        if list1.val < list2.val:
            tail.next = list1
            list1 = list1.next
        else:
            tail.next = list2
            list2 = list2.next
        tail = tail.next

    tail.next = list1 if list1 else list2
    return dummy.next

# Example
def printList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

l1 = ListNode(1, ListNode(2, ListNode(4)))
l2 = ListNode(1, ListNode(3, ListNode(4)))
printList(mergeTwoLists(l1, l2))  # Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> None
