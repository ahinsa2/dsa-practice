arr = [1, 3, 2, 7, 4, 6, 5, 8]   # you can change this input
n = len(arr)
is_min_heap = True

for i in range(n // 2):  # check only non-leaf nodes
    left = 2 * i + 1
    right = 2 * i + 2

    if left < n and arr[i] > arr[left]:
        is_min_heap = False
        break
    if right < n and arr[i] > arr[right]:
        is_min_heap = False
        break

if is_min_heap:
    print("YES")
else:
    print("NO")
