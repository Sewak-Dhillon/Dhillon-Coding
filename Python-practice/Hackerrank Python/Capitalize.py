# You are asked to ensure that the first and last names of people begin with a capital letter in their passports. For example, alison heck should be capitalised correctly as Alison Heck.


# Given a full name, your task is to capitalize the name appropriately.

# Input Format

# A single line of input containing the full name, S.

# Note: in a word only the first character is capitalized. Example 12abc when capitalized remains 12abc.

# Output Format

# Print the capitalized string, S.

# Sample Input

# chris alan
# Sample Output

# Chris Alan

#!/bin/python3


# Complete the solve function below.
def solve(s):
    temp = s.split(" ")
    result = []
    for x in temp:
        string = str(x)
        result.append(string.capitalize())
    
    return " ".join(result)
    
s = input()
result = solve(s)
print(result)