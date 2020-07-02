#Messing with indexes and dicts 
my_dic = {1: "Vader", 2: "Sidious", 3: "Dooku", 4: "Maul"}
print(my_dic.keys())
print(my_dic.values())
print(my_dic.items())



listd = [2,4,6,8,10]
for index, val in enumerate(listd):
    print(val, "is in", listd, "at index", index)


for val in range(-12,-3,2):
    print(val, end=" ")