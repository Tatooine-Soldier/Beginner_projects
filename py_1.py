def sort_a_list(s):
    i = 0
    while i < len(s):
        for val in s:
            if val2 in s:
                s.remove(val2)   #Removes duplicates
                m = min(s)
            else:
                m = min(s)
                return m


print(sort_a_list([2,3,1,5,4]))