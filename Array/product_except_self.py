def product_except_self(nums):
    n = len(nums)
    result = [1] * n

    # Prefix product
    for i in range(1, n):
        result[i] = result[i - 1] * nums[i - 1]

    # Multiply with suffix product
    suffix = 1
    for i in range(n - 1, -1, -1):
        result[i] *= suffix
        suffix *= nums[i]

    return result

# Example
print(product_except_self([1, 2, 3, 4]))
