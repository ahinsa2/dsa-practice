class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(head):
    prev = None
    curr = head
    while curr:
        next_node = curr.next
        curr.next = prev
        prev = curr
        curr = next_node
    return prev

# Example
def printList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
printList(reverseList(head))  # Output: 5 -> 4 -> 3 -> 2 -> 1 -> None
