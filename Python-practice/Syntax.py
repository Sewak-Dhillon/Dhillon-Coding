
# Python was invented by Guido van Rossum in 1991
a = 10
str = "Gursewak singh"

for x in str:
    print(x)

print(len(str))

print("singh" in str)

if "singh" in str:
    print("yes")

if "singh" not in str:
    print("not present in string")


b = "My name is "
c = "gursewak singh"
a = b + c

print(a)
# String Slicing

print(b[1:5])
print(b[:5])
print(b[1:])
print(b[-5:-1])

# Modify String

print(b.upper())
print(b.lower())
print(b.strip())
print(b.replace("g" , "d"))
print(b.split())


