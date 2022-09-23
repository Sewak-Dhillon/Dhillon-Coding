# You are given T testcases , each testcase consists of 3 numbers , P,X,Y,Z.
# You have a best friend named Rahul. Z is 1 if you will meet Rahul and 0 otherwise. You initially has an Emotional Proximity of P, which increases by Y% if you meet Rahul and decreases by X% otherwise. You have to print the final Emotional Proximity.


T = eval(input())
matrix = []
while T != 0:
    T -= 1
    P,X,Y,Z = list(map(int,input().split()))
    if 0 <= Z <=1:
        if Z == 1:
            P += P * (Y/100)
        else:
            P -= P * (X/100)
    matrix.append(P)

for x in matrix:
    print(format(x,'.10f'))




