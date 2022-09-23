# Find the Second Highest Number.

i = int(input())
matrix = list(map(int,input().split()))

# First Highest Number.
temp = max(matrix)
while max(matrix) == temp:  # Removing First Highest Number.
    matrix.remove(max(matrix))

print (max(matrix))
