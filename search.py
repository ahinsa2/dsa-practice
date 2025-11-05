l = []
for i in range(10):
    num = int(input("Enter number: "))
    l.append(num)

search = int(input("Enter number to search: "))

if search in l:
    print(search, "is present", l.count(search), "times.")
else:
    print(search, "is not present in the list.")
