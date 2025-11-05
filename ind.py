# Accept a string from the user
s = input("Enter a string: ")

# Display characters with positive indexing
print("\nCharacters with positive indexing:")
for i in range(len(s)):
    print(f"Index {i}: {s[i]}")

# Display characters with negative indexing
print("\nCharacters with negative indexing:")
for i in range(-1, -len(s)-1, -1):
    print(f"Index {i}: {s[i]}")
