def plusOne(digits):
    n = len(digits)

    for i in range(n - 1, -1, -1):

        if digits[i] < 9:
            digits[i] += 1
            return digits

        # If digit is 9, make it 0
        digits[i] = 0

    result = [0] * (n + 1)
    result[0] = 1
    return result
