#Continuous assessment
#1
powers = [i*i for i in range(1, 6) if i % 2 == 0]
print(powers)


# 2
def F(s1, s2):
    r = []
    i = 0
    j = 0
    while i < len(s1):
        while j < len(s2):
            if s1[i] == s2[j]:
                r.append(s1[i])
            j += 1
        i += 1
        return r


print(F([1, 2, 3], [2, 4]))
"""

# 3


"""
#4
def iter_factorial(n):
    i = 1
    for val in range(1, n+1):
        i = i*val
        result = i
    return result


print(iter_factorial(6))
"""
"""
#5
for val in range(1,101):
    print(val, end="")
"""