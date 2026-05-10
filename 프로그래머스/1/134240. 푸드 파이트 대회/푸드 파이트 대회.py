def solution(food):
    prefix = ""
    for i in range(1, len(food)):
        prefix += str(i) * (food[i] // 2)
    
    return prefix + "0" + prefix[::-1]