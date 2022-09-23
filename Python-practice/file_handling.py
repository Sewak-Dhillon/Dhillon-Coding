# Creating a file directly.

# file1 = open("dhillon.txt","x")
# print("File created")

# File Writing.

# file1 = open("dhillon.txt", "w")
# file1.write("My name is gursewak singh\nMy uid is 20BCS9619\nI am persuing my BE degree from Chandhigarh University")
# file1.close()

# Adding some more data to file.

# file1 = open("dhillon.txt", "a")
# file1.write("\nMy age is 19\nI am from Mehrauli\nPython is a programming language created by Guido van rossum in 1991")
# file1.close()

# File Reading.

# file1 = open("dhillon.txt", "r")
# print(file1.read()) 
# It will print whole data present in file.

# print(file1.readlines()) 
# It will print your data as stored in array.

# print(file1.readline()) 
# It will print the first line present in the file.
# file1.close()


# Using with() and split() function.

# with open("dhillon.txt") as file1:
#     data = file1.readlines()
#     for i in data:
        # word = i.split()
#  This splits the variable when space is encountered.
        # print(data)



# Some practice programs

# file1 = open("copy.txt","x")

# code 1

for i in range (65,91):
    with open(chr(i) + ".txt","x") as file:
        file.write(chr(i)+".txt is created" )


# code 2

file1 = open("dhillon.txt", "w")
for i in range (1,27):
    if i%4 == 0:
        file1.write(chr(64+i))
        file1.write(" ")
        file1.write("\n")
    else:
        file1.write(chr(64+i))
        file1.write(" ")
file1.close()

# code 3

import random

def random_line(file1):
    line = open(file1).read().splitlines()
    return random.choice(line)

print("\n\n",random_line("dhillon.txt"),"\n\n")

# code 4

from collections import Counter
def word_count(file1):
        with open(file1) as file:
                return Counter(file.read().split())

print("Number of words in the file :",word_count("dhillon.txt"))


# code 5

file1 = open("dhillon.txt","r+")
file2 = open("copy.txt","r+")

for i in file1.read():
    file2.write(i)

file1.close()
file2.close()

