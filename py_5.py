#Exam question
def to_english(n):
    positive_dictionary = {0: "Zero", 1: "One", 2: "Two", 3: "Three", 4: "Four", 5: "Five", 6: "Six", 7: "Seven",
                           8: "Eight", 9: "Nine", 10: "Tem", 11: "Eleven", 12: "Twelve", 13: "Thirteen", 14: "Fourteen",
                           15: "Fifteen", 16: "Sixteen", 17: "Seventeen", 18: "Eighteen", 19: "Nineteen", 20: "Twenty",
                           30: "Thirty", 40: "Forty", 50: "Fifty", 60: "Sixty", 70: "Seventy", 80: "Eighty",
                           90: "Ninety"}
    negative_dictionary = {-1: "Minus one", -2: "Minus two", -3: "Minus three", -4: "Minus four", -5: "Minus five",
                           -6: "Minus six", -7: "Minus seven", -8: "Minus eight", -9: "Minus nine", -10: "Minus tem",
                           -11: "Minus eleven", -12: "twelve", -13: "thirteen", -14: "Minus fourteen",
                           -15: "Minus fifteen", -16: "Minus sixteen", -17: "Minus seventeen", -18: "Minus eighteen",
                           -19: "Minus nineteen", -20: "Minus twenty", -30: "Minus thirty", -40: "Minus forty",
                           -50: "Minus fifty", -60: "Minus sixty", -70: "Minus seventy", -80: "Minus eighty",
                           -90: "Minus ninety"}

    positive_limit = 1000
    negative_limit = -1000

    while -1000 < n < 1000:
        if 0 < n < 20:
            return positive_dictionary[n]

        if 20 < n < 100:
            if n % 10 == 0:
                return positive_dictionary[n]
            else:
                return positive_dictionary[n // 10 * 10] + " " + positive_dictionary[n % 10]

        if 100 < n < positive_limit:
            if n % 100 == 0:
                return positive_dictionary[n // 100] + " hundred "
            else:
                return positive_dictionary[n // 100] + " hundred " + "and " + to_english(n % 100)



        if 0 > n > -20:
            return negative_dictionary[n]

        if -20 > n > -100:
            if n % 10 == 0:
                return negative_dictionary[n]
            else:
                return negative_dictionary[n // 10 * 10] + " " + negative_dictionary[n % 10]

        if -100 > n > negative_limit:
            if n % 100 == 0:
                return negative_dictionary[n // 100] + " hundred "
            else:
                return negative_dictionary[n // 100] + " hundred " + "and " + to_english(n % 100)



