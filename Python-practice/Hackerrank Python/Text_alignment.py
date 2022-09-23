# In Python, a string of text can be aligned left, right and center.

# .ljust(width)

# This method returns a left aligned string of length width.

# >>> width = 20
# >>> print 'HackerRank'.ljust(width,'-')
# HackerRank----------  
# .center(width)

# This method returns a centered string of length width.

# >>> width = 20
# >>> print 'HackerRank'.center(width,'-')
# -----HackerRank-----
# .rjust(width)

# This method returns a right aligned string of length width.

# >>> width = 20
# >>> print 'HackerRank'.rjust(width,'-')
# ----------HackerRank
# Task

# You are given a partial code that is used for generating the HackerRank Logo of variable thickness.
# Your task is to replace the blank (______) with rjust, ljust or center.

# Input Format

# A single line containing the thickness value for the logo.

# Output Format

# Output the desired logo.

# Sample Input

# 5
# Sample Output

#     H    
#    HHH   
#   HHHHH  
#  HHHHHHH 
# HHHHHHHHH
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHHHHHHHHHHHHHHHHHHHHHH   
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#   HHHHH               HHHHH             
#                     HHHHHHHHH 
#                      HHHHHHH  
#                       HHHHH   
#                        HHH    
#                         H 
num = eval(input())
dif = int(((num*2)-num)/2)
line = dif + 1
for x in range(num):
    for y in range(x,num-1):
        print(" ",end='')
    for y in range(x):
        print("H",end='')
    for y in range(x+1):
        print("H",end='')
    print()
for x in range(num+1):
    for y in range(dif):
        print(" ",end='')
    for y in range(num):
        print("H",end='')
    for y in range(num*3):
        print(" ",end='')
    for y in range(num):
        print("H",end='')
    print()
for x in range(line):
    for y in range(dif):
        print(" ",end='')
    for y in range(num*5):
        print("H",end='')
    print()
for x in range(num+1):
    for y in range(dif):
        print(" ",end='')
    for y in range(num):
        print("H",end='')
    for y in range(num*3):
        print(" ",end='')
    for y in range(num):
        print("H",end='')
    print()
for x in range(num):
    for y in range(num*4):
        print(" ",end='')
    for y in range(x):
        print(" ",end='')
    for y in range(x,num-1):
        print("H",end='')
    for y in range(x,num):
        print("H",end='')
    print()
