from collections import Counter

def solution(array):
    c = Counter(array)
    max_counter = max(c.values())
    
    mode = []
    
    for key, counter in c.items():
        if counter == max_counter:
            mode.append(key)
            
    if len(mode)>1:
        return -1
    
    return mode[0]