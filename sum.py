import random

# Create a 4x4 matrix with random 0s and 1s
matrix = [[random.randint(0, 1) for _ in range(4)] for _ in range(4)]

# Display the matrix
for row in matrix:
    print(row)

# Find the row with the most 1s
row_counts = [sum(row) for row in matrix]
max_row = row_counts.index(max(row_counts))

# Find the column with the most 1s
col_counts = [sum(matrix[i][j] for i in range(4)) for j in range(4)]
max_col = col_counts.index(max(col_counts))

print("Row with most 1s:", max_row)
print("Column with most 1s:", max_col)
