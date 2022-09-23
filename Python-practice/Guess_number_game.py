import random

guess = random.randint(1,100)
count = 0
while(count<5):
    count += 1
    num = eval(input("\nGuess number : "))
    if (num<guess):
        print("\nTry some larger number")
    elif(num>guess):
        print("\nTry some Smaller number")
    else:
        print("\nCongratulation you did it in ",count," try")
        break
    

if (count>=5):
    print("\n**Game over**")
    print("Number is : ",guess)
