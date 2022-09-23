def missingCharacters(s):
    alpha = ""
    num = ""
    n = []
    a = []
    for x in s:
        if x.isalpha():
            alpha += x
        else:
            num += x
    for x in range(10):
        n.append(x)
    for x in range(97,123):
        a.append(chr(x))
    print(a)
    for x in alpha:
        for y in a:
            if x == y:
                a.remove(y)
            else:
                continue
    for x in num:
        for y in n:
            if int(x) == int(y):
                n.remove(int(y))
            else:
                continue
    matrix = ""
    for x in n:
        matrix += str(x)
    for x in a:
        matrix += x
    print(matrix)
s = input()
result = missingCharacters(s)