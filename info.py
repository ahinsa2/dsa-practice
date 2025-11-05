# Create an empty dictionary
students = {}

# Input number of students
n = int(input("Enter number of students: "))

# Enter name and percentage for each student
for i in range(n):
    name = input("Enter student's name: ")
    percentage = float(input("Enter percentage: "))
    students[name] = percentage

# Display the information
print("\nStudent Information:")
for name, percentage in students.items():
    print("Name:", name, " | Percentage:", percentage)
