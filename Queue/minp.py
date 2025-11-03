def is_min_priority_queue(arr):
    n = len(arr)
    for i in range(n // 2):  # only need to check non-leaf nodes
        left = 2 * i + 1
        right = 2 * i + 2
        
        if left < n and arr[i] > arr[left]:
            return "NO"
        if right < n and arr[i] > arr[right]:
            return "NO"
    return "YES"

# Example 1
arr1 = [1, 3, 2, 7, 4, 6, 5, 8]
print(is_min_priority_queue(arr1))  # Output: YES

# Example 2
arr2 = [1, 3, 4, 7, 2, 5, 6, 8]
print(is_min_priority_queue(arr2))  # Output: NO
