# List is a collection which is ordered and changeable. Allows duplicate members.

# Tuple is a collection which is ordered and unchangeable. Allows duplicate members.

# Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.

# Dictionary is a collection which is ordered** and changeable. No duplicate members.

from typing import Tuple


my_Tuple = ("my" , "name", "is "," gursewak", "singh")
print(type(my_Tuple))
print(len(my_Tuple))
print(my_Tuple)

# Accessing Tuple values.

my_Tuple = ("my" , "name", "is "," gursewak", "singh")
print(my_Tuple[1])
print(my_Tuple[1:4])
print(my_Tuple[-4:-1])
print(my_Tuple[2:])
print(my_Tuple[:3])

# Updating Tuple.

my_Tuple = ("my" , "name", "is "," gursewak", "singh")
my_Tuple1 = ("my" , "name", "is "," gursewak", "singh")

my_Tuple += my_Tuple1
print(my_Tuple)

my_List = list(my_Tuple)
my_List.append("cse")
my_List.remove("singh")
my_Tuple = tuple(my_List)
print(my_Tuple)

del my_Tuple1
print(my_Tuple1) # It will generate an Error message.

# Unpacking Tuple.

my_Tuple = ("my" , "name", "is ","gursewak", "singh")
(first,second,third,fourth,fifth) = my_Tuple

print(first)
print(second)
print(third)
print(fourth)
print(fifth)

(first,second,*third) = my_Tuple
print(first)
print(second)
print(third)

(first,*second,third) = my_Tuple
print(first)
print(second)
print(third)


# Loops, conditional statement and joining two Tuples.

my_Tuple = ("my" , "name", "is ","gursewak", "singh")
my_Tuple1 = ("cse",)

c = my_Tuple + my_Tuple1
print(type(c))
print(len(c))
print((c))

for x in my_Tuple:
    if "a" in x:
        print("\na is present in", x)
