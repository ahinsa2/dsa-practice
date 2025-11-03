def increase_key(arr, i, new_key):
    if new_key < arr[i]:
        print("New key is smaller than current key")
        return
    
    arr[i] = new_key
    while i > 0:
        parent = (i - 1) // 2
        if arr[parent] < arr[i]:
            arr[parent], arr[i] = arr[i], arr[parent]
            i = parent
        else:
            break

# Example:
arr = [8, 5, 7, 4, 1, 6, 3, 2]  # MAX-Heap
print("Before:", arr)
increase_key(arr, 4, 9)  # increase key at index 4 (value 1 → 9)
print("After: ", arr)
