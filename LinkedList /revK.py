class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def reverse_k_group(head, k):
    # Check if there are at least k nodes
    temp = head
    for _ in range(k):
        if not temp:
            return head
        temp = temp.next

    prev, curr = None, head
    count = 0

    # Reverse k nodes
    while count < k and curr:
        nxt = curr.next
        curr.next = prev
        prev = curr
        curr = nxt
        count += 1

    # head is now the end of reversed group
    if curr:
        head.next = reverse_k_group(curr, k)

    return prev

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end="->" if temp.next else "\n")
        temp = temp.next

# Example usage
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(4)
head.next.next.next.next = Node(5)
head.next.next.next.next.next = Node(6)
head.next.next.next.next.next.next = Node(7)
head.next.next.next.next.next.next.next = Node(8)

print("Original List:")
print_list(head)

head = reverse_k_group(head, 3)

print("Modified List:")
print_list(head)
