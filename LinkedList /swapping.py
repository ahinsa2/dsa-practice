class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def swap_first_last(head):
    if not head or not head.next:
        return head  # Empty or single node
    
    # If only 2 nodes
    if not head.next.next:
        second = head.next
        second.next = head
        head.next = None
        return second

    prev_last = head
    while prev_last.next.next:
        prev_last = prev_last.next

    last = prev_last.next
    prev_last.next = head
    last.next = head.next
    head.next = None
    head = last

    return head

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end="->" if temp.next else "\n")
        temp = temp.next

# Example usage
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)
head.next.next.next.next = Node(50)

print("Original List:")
print_list(head)

head = swap_first_last(head)

print("Modified List:")
print_list(head)
