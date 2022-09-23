# You are given T testcases , in each testcase you are given three numbers A, B and C .
# Find that whether an expression of the form ‘‘xAyBzC" exists ( where x , y and z can be + or − ) , such that the final result is 0. If it exists print ‘‘YES" (without quotes), else print ‘‘NO"(without quotes).


T = eval(input())
final_list = []
while T != 0:
    T -= 1
    A,B,C = list(map(int,input().split()))
    if 1 <= A <= pow(10,18) and 1 <= B <= pow(10,18) and 1 <= C <= pow(10,18):
        if A + B + C == 0:
            final_list.append("YES")
        elif A + B - C == 0:
            final_list.append("YES")
        elif A - B + C == 0:
            final_list.append("YES")
        elif A - B - C == 0:
            final_list.append("YES")
        else:
            final_list.append("NO")

for x in final_list:
    print(x)   