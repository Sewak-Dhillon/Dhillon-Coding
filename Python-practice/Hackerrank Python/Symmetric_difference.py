# Input Format

# The first line of input contains an integer, .
# The second line contains  space-separated integers.
# The third line contains an integer, .
# The fourth line contains  space-separated integers.

# Output Format

# Output the symmetric difference integers in ascending order, one per line.

# Sample Input

# STDIN       Function
# -----       --------
# 4           
# 2 4 5 9     
# 4           
# 2 4 11 12   
# Sample Output

# 5
# 9
# 11
# 12


num1 = eval(input())
matrix1 = set(map(int,input().split()))
num2 = eval(input())
matrix2 = set(map(int,input().split()))

final1 = matrix1.difference(matrix2)
final2 = matrix2.difference(matrix1)
final = sorted(final1.union(final2))
for x in final:
    print(x)