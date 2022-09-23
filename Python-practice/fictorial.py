def fictorial(x):
    if x == 1:
        return 1
    else:
        return x * fictorial(x-1)

num = eval(input("Enter a number : "))
if num<0:
    print("Fictorial of number does't exist")
elif num == 0:
    print("The factorial of 0 is 1")
else:
    x = fictorial(num)
    print("The factorial of", num, "is", x)


