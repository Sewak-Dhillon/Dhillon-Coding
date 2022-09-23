def check_palidrome(num):
    num = n
    reversed_num = 0
    while num!=0:
        digit = num%10
        reversed_num = reversed_num*10 + digit
        num //= 10
    
    return reversed_num == n
    
n = eval(input())
arr = []
for i in range(n):
    num = eval(input())  
    arr.append(num)
for i in range(n):  
    num = arr[i]
    print(check_palidrome(num))


    