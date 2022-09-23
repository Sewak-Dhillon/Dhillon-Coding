# 1. Output

# * * * * *
# * * * * *
# * * * * *
# * * * * *
# * * * * *

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for y in range (num): # It denotes number of columns.
        print("*",end=' ')
    print() 

# 2. Output

# * * * * *
# * * * * 
# * * *
# * *      
# *        

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for y in range (x,num): # It denotes number of columns.
        print("*",end=' ')
    print() 


# 3. Output

# * 
# * * 
# * * * 
# * * * * 
# * * * * *

# Code

num = 5
p = 101
for x in range(num): # It denotes number of rows.
    for y in range (x+1): # It denotes number of columns.
        print(chr(p+y),end=' ')
    p -= 1
    print()  

# 4. Output

# * * * * *
#   * * * *
#     * * * 
#       * *
#         *

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for y in range(x):
        print(" ",end=' ')
    for y in range (x,num): # It denotes number of columns.
        print("*",end=' ')
    print()    

# 5. Output

#         * 
#       * * * 
#     * * * * *
#   * * * * * * *
# * * * * * * * * *    

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for y in range(x,num-1):
        print(" ",end=' ')
    for z in range (x): # It denotes number of columns.
        print("*",end=' ')
    for i in range (x+1): # It denotes number of columns.
        print("*",end=' ')
    print()    
# 6. Output

# * * * * * * * * *            
#   * * * * * * *
#     * * * * * 
#       * * *
#         *

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for z in range(x): # It denotes number of columns.
        print(" ",end=' ')
    for i in range (x,num-1): # It denotes number of columns.
        print("*",end=' ')
    for i in range (x,num): # It denotes number of columns.
        print("*",end=' ')
    print()    

# 7. Output

# * * * * * * * * *            
#   * * * * * * *
#     * * * * * 
#       * * *
#         *
#         * 
#       * * * 
#     * * * * *
#   * * * * * * *
# * * * * * * * * *

# Code

num = 5
for x in range(num): # It denotes number of rows.
    for z in range(x): # It denotes number of columns.
        print(" ",end=' ')
    for i in range (x,num-1): # It denotes number of columns.
        print("*",end=' ')
    for i in range (x,num): # It denotes number of columns.
        print("*",end=' ')
    print()    
for x in range(num): # It denotes number of rows.
    for z in range(x,num-1): # It denotes number of columns.
        print(" ",end=' ')
    for i in range (x): # It denotes number of columns.
        print("*",end=' ')
    for i in range (x+1): # It denotes number of columns.
        print("*",end=' ')
    print()    



