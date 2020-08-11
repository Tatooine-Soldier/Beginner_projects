def toCyrillic(s):
    rusDict = {'a': 'а', 'b': 'б', 'c': 'k', 'd': 'д', 'e': 'e', 'f': 'ф', 'g': 'г', 'h': 'x', 'i': 'и', 'j': 'дж',
               'k': 'к', 'l': 'л', 'm': 'м', 'n': 'н', 'o': 'o', 'p': 'п', 'q': 'к', 'r': 'р', 's': 'с', 't': 'т',
               'u': 'у', 'v': 'в', 'w': '', 'x': 'экс', 'y': 'ю', 'z': 'з', ' ': ' '}
    result = ""
    s = s.lower()
    for val in s:
        result += rusDict[val]
    return result
toCyrillic("Photo")
