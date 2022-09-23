# Input Format

# The first line contains integers  and  separated by a space.
# The second line contains  integers, the elements of the array.
# The third and fourth lines contain  integers,  and , respectively.

# Output Format

# Output a single integer, your total happiness.

# Sample Input

# 3 2
# 1 5 3
# 3 1
# 5 7
# Sample Output

# 1
# Explanation

# You gain  unit of happiness for elements  and  in set . You lose  unit for  in set . The element  in set  does not exist in the array so it is not included in the calculation.

# Hence, the total happiness is .


num1, num2 =map(int,input().split())
matrix1 = set(map(int,input().split()))
matrix2 = set(map(int,input().split()))
matrix3 = set(map(int,input().split()))
print(sum([(x in matrix2) - (x in matrix3) for x in matrix1]))



