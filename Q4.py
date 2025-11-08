

s = input("Enter a string containing numbers: ")

num = ""
total = 0

for ch in s:
    if ch.isdigit():         
        num += ch
    else:
        if num != "":
            total += int(num)  
            num = ""           

if num != "":                 
    total += int(num)

print("Sum of numbers:", total)
