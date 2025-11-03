arr = [8, 5, 7, 4, 1, 6, 3, 2]   # Max-Priority Queue
i = 4                             # index to increase (element = 1)
new_key = 9                       # new key value

if new_key < arr[i]:
    print("New key is smaller than current key")
else:
    arr[i] = new_key
    while i > 0:
        parent = (i - 1) // 2
        if arr[parent] < arr[i]:
            arr[parent], arr[i] = arr[i], arr[parent]
            i = parent
        else:
            break

print("Updated Max-Priority Queue:", arr)
