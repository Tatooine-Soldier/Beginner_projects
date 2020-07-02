def fibonacci():
    number = int(input("How many numbers do you want?: "))
    i = 1
    dlist = [1,1]
    while len(dlist) < number:
        dlist.append(dlist[i]+dlist[i-1])
        i += 1
    print(dlist)