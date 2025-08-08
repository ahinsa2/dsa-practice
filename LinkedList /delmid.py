class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def delete_middle(head):
    if head is None or head.next is None:
        return None

    slow = head
    fast = head
    prev = None

    while fast and fast.next:
        fast = fast.next.next
        prev = slow
        slow = slow.next

    prev.next = slow.next

    return head

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")
