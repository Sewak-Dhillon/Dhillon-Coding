# This tool returns the  length subsequences of elements from the input iterable.

# Combinations are emitted in lexicographic sorted order. So, if the input iterable is sorted, the combination tuples will be produced in sorted order.

# Sample Code

# >>> from itertools import combinations
# >>> 
# >>> print list(combinations('12345',2))
# [('1', '2'), ('1', '3'), ('1', '4'), ('1', '5'), ('2', '3'), ('2', '4'), ('2', '5'), ('3', '4'), ('3', '5'), ('4', '5')]
# >>> 
# >>> A = [1,1,3,3,3]
# >>> print list(combinations(A,4))
# [(1, 1, 3, 3), (1, 1, 3, 3), (1, 1, 3, 3), (1, 3, 3, 3), (1, 3, 3, 3)]
# Task

# You are given a string .
# Your task is to print all possible combinations, up to size , of the string in lexicographic sorted order.

# Input Format

# A single line containing the string  and integer value  separated by a space.

# Output Format

# Print the different combinations of string  on separate lines.

# Sample Input

# HACK 2
# Sample Output

# A
# C
# H
# K
# AC
# AH --
# AK
# CH --
# CK
# HK

from itertools import combinations

string,num = input().split()
matrix = []
string = sorted(string)
num = int(num)
for x in range(1,num+1):
    list1 =list(combinations(string,x))
    for x in list1:
        matrix.append(x)
for x in matrix:
    print("".join(x))