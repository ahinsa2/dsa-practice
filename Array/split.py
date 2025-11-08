arr = [4, 8, 1, 2, 16, 15]

total_sum = sum(arr)

# The sum must be even to be split equally
if total_sum % 2 != 0:
    print("No such pair found")
else:
    target = total_sum // 2
    found = False

    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                print(arr[i], arr[j])
                found = True

    if not found:
        print("No such pair found")
