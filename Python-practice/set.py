# List is a collection which is ordered and changeable. Allows duplicate members.

# Tuple is a collection which is ordered and unchangeable. Allows duplicate members.

# Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.

# Dictionary is a collection which is ordered** and changeable. No duplicate members.

# Sets in Python.

my_set = {"iphone", "users","hello", "world"}

print(type(my_set))
print(len(my_set))
print((my_set))

# Access items from sets. 
my_set = {"iphone", "users","hello", "world"}
for x in my_set:
    print(x)

# Add items to set
my_set = {"iphone", "users","hello", "world"}
new_Set = {"dh"}
my_set.add("dhillon")
my_set.update(new_Set)
print(my_set)

# Remove Set items

my_set = {"iphone", "users","hello", "world"}
my_set.remove("world")
my_set.discard("user")
my_set.pop()
print(my_set)

# Loops in sets
my_set = {"iphone", "users","hello", "world"}
for x in my_set:
    print(x)

    








