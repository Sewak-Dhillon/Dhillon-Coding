def swap(a,b):
    temp = a
    a = b
    b = temp
    return a,b

x,y = swap(200,10)
print("x : ", x ,"\ny : ",y)