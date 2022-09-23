num = eval(input())
count = 0
score1 = []
name1 = []
matrix = []

for x in range(num):
    list1 = []
    name = (input())
    score = eval(input())
    list1.append(name)
    list1.append(score)
    matrix.append(list1)
    score1.append(score)


temp1 = min(score1)
# print(temp1)
while min(score1) == temp1: 
    score1.remove(min(score1))

temp2 = min(score1)
# print(temp2)
# # print(matrix)
for x in matrix:
    for y in x:
        count += 1
        if count%2 ==0:
            if y != temp2:
                name1.pop()
            else:
                continue
        else:
            name1.append(y)
name1.sort()
for x in name1:
    print(x)
