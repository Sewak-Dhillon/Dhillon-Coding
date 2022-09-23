# Following is pseudo-code 

# if year is divisible by 400 then is_leap_year
# else if year is divisible by 100 then not_leap_year
# else if year is divisible by 4 then is_leap_year
# else not_leap_year


def is_leap(year):
    leap = False
    
    if year%400 == 0:
        leap = True
    elif year%100 == 0:
        leap = False
    elif year%4 == 0:
        leap = True
    else:
        leap = False    
    
    
    
    return leap

year = int(input())
print(is_leap(year))
num = int(input())