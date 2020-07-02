#Another exam q
def grades(value):
    grades = ["A", "B", "C", "D", "E", "F"]
    scores = ["100-85", "84-70", "69-55", "54-40", "39-25", "24-0"]
    while value in grades or value in range(0,10000):
        while value in range(0,101) or value in grades:
            if value == "A":
                return scores[0]
            elif value in range(85, 101):
                return grades[0]
            elif value == "B":
                return scores[1]
            elif value in range(70, 85):
                return grades[1]
            elif value == "C":
                return scores[2]
            elif value in range(55, 70):
                return grades[2]
            elif value == "D":
                return scores[3]
            elif value in range(40, 55):
                return grades[3]
            elif value == "E":
                return scores[4]
            elif value in range(25, 40):
                return grades[4]
            elif value == "F":
                return scores[5]
            elif value in range(0, 25):
                return grades[5]
            break
        else:
            print("The input numerical grade is outside the range supported")
            break
    else:
        print("The input letter grade is outside the range supported")