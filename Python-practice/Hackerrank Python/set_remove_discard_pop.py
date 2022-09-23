num1 = int(input())
room = set(map(int,input().split())) 
num2 = int(input())
total = 0
for i in range(num2):
    x = list(input().split())
    if x[0] == "pop":
        room.pop()
    elif x[0] == "remove":
        room.remove(int(x[1]))
    elif x[0] == "discard":
        room.discard(int(x[1]))
        
for x in room:
    total += x
    
print(total)