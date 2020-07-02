def seasons(number):
    my_dict = {1:"Winter", 2:"Spring", 3:"Summer", 4:"Autumn"}
    if number in range(1, 1000):
        while number < 5:
            if number == 1:
                return my_dict[1]
            elif number == 2:
                return my_dict[2]
            elif number == 3:
                return my_dict[3]
            elif number == 4:
                return my_dict[4]
            break
        else:
            print("Number entered", number, "is outside of input values")
    else:
        print("Input value must be a number")