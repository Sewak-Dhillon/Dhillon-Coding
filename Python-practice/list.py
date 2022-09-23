# List is a collection which is ordered and changeable. Allows duplicate members.

# Tuple is a collection which is ordered and unchangeable. Allows duplicate members.

# Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.

# Dictionary is a collection which is ordered** and changeable. No duplicate members.

# List in Python
List1 = ["apple" , "banana" , "cherry"]
List2 = ["apple" , "banana" , "cherry"]
print(len(List1))
print(List1[::-1]) # Print list in reverse order
print(List1[2:0:-1])


List1.insert(2,"two")
List1.append("orange")
List1[1:2] = ["mango"]

List2.clear()
del List2
List1.pop(1)
print(List1)


for i in range (len(List1)):
    print(List1[i])
[print(x) for x in List1 ]

x  = 0
while x < len(List1):
    print(List1[x])
    x += 1


List1 = ["apple" , "banana" , "cherry"]
newList = []
for x in List1:
    if 'a' in x:
        newList.append(x)

newList = [x for x in List1 if 'a' in x]

print(newList)