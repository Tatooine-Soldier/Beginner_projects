def ascii_difference(m, n):
    addition_list = []
    subtraction_list = []
    result = addition_list[0] + addition_list[1]
    i = 0
    while i < len(m):
        while i == m[i]:
            addition_list.append(ord(m[i]))
            break
        while i == n[i]:
            addition_list.append(ord(n[i]))
            addition_list.append(result)
            addition_list.remove(ord(m[i]))
            addition_list.remove(ord(n[i]))
        return result