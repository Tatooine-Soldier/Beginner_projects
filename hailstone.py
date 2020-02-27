def hailStone(n):
    new = []
    while n != 1:
        if n % 2 == 0:
            new.append(n)
            n = n // 2
        elif n % 2 != 0:
            new.append(n)
            n = (n * 3) + 1
    new.insert(len(new), 1)
    return new
print(hailStone(20))








