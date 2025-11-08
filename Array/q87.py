arr = [1, 2, 3, 4, 5]
arr.sort()
count = 0
n = len(arr)

for i in range(n - 2):
    k = i + 2
    for j in range(i + 1, n - 1):
        while k < n and arr[i] + arr[j] > arr[k]:
            k += 1
        count += (k - j - 1)

print(count)
