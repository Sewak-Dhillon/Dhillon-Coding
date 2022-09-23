#     Size: 7 x 21 
#     ---------.|.---------
#     ------.|..|..|.------
#     ---.|..|..|..|..|.---
#     -------WELCOME-------
#     ---.|..|..|..|..|.---
#     ------.|..|..|.------
#     ---------.|.---------
    
#     Size: 11 x 33
#     ---------------.|.---------------
#     ------------.|..|..|.------------
#     ---------.|..|..|..|..|.---------
#     ------.|..|..|..|..|..|..|.------
#     ---.|..|..|..|..|..|..|..|..|.---
#     -------------WELCOME-------------
#     ---.|..|..|..|..|..|..|..|..|.---
#     ------.|..|..|..|..|..|..|.------
#     ---------.|..|..|..|..|.---------
#     ------------.|..|..|.------------
#     ---------------.|.---------------
# Input Format

# A single line containing the space separated values of m and n.

# Sample Input

# 9 27
# Sample Output

# ------------.|.------------
# ---------.|..|..|.---------
# ------.|..|..|..|..|.------
# ---.|..|..|..|..|..|..|.---
# ----------WELCOME----------
# ---.|..|..|..|..|..|..|.---
# ------.|..|..|..|..|.------
# ---------.|..|..|.---------
# ------------.|.------------

list1 = list(map(int,input().split()))
num1 = list1[0]
num2 = list1[1]
wel = int((num2 - 7)/2)
num3 = int(num1 / 2)
num4 = num3*3

for x in range(num3):
    for y in range(x,num4):
        print("-",end='')
    num4 -= 2
    for y in range(x+1):
        print(".|.",end='')
    for y in range(x):
        print(".|.",end='')
    for y in range(x,num4+2):
        print("-",end='')
    print()
for x in range(1):
    for y in range(num2):
        if y == wel:
            print("W",end='')
        elif y == wel+1:
            print("E",end='')
        elif y == wel+2:
            print("L",end='')
        elif y == wel+3:
            print("C",end='')
        elif y == wel+4:
            print("O",end='')
        elif y == wel+5:
            print("M",end='')
        elif y == wel+6:
            print("E",end='')
        else:
            print("-",end='')

print()

for x in range(1,num3+1):
    for y in range(x*3):
        print("-",end='')
    for y in range(x,num3+1):
        print(".|.",end='') 
    for y in range(x,num3):
        print(".|.",end='') 
    for y in range(x*3):
        print("-",end='')
    print()
 

        