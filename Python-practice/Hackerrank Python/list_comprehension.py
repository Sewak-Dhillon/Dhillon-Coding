matrix = []
final_matrix = []
x = eval(input())
y = eval(input())
z = eval(input())
n = eval(input())

for i in range(x+1):
    for j in range(y+1):
        for k in range(z+1):
            matrix.append([i,j,k])

for i in matrix:
    temp = 0
    for x in i:
        temp += x
    if temp != n:
        final_matrix.append(i)

# print(matrix)
print(final_matrix)


# Kunals Code

# list1=[]
# final_list=[]
# x = int(input("x:"))
# y = int(input("y:"))
# z = int(input("z:"))
# n = int(input("n:"))

# for i in range(x+1):
#     for j in range(y+1):
#         for k in range(z+1):
#             list1.append([i,j,k])

# for items in list1:
#     sum=0
#     for inneritems in items:
#         sum+=inneritems
#     if sum != n:
#         final_list.append(items)

# print(f"list1: {list1}")
# print(f"final_list: {final_list}")