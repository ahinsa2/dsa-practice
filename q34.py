s = "iter"
new_s = ""

for i in range(len(s)):
    new_s += chr(ord(s[i]) + 3)   # shift each character by 3

print("Original string:", s)
print("Shifted string:", new_s)
