def anagram(s1, s2):
    result = False              #set your base
    if len(s1) == len(s2):         #can't be anagrams if diff length
        count = 0                #used to check for matches
        i = 0
        while i < len(s1):      #'outer loop' for s1
            j = 0
            while j < len(s2):  #'inner loop' to check every s2 letter for each s1 letter
                if s1[i:i+1] == s2[j:j+1]:   #if theres a match
                    count += 1     #++ count
                j += 1
            i += 1
        if count == len(s1):  #if count == s1len then it means they must have the exact same letters
            result = True
    return result

anagram("jack","kabj")
        
