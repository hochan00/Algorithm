def solution(arr):
    is_true = True
    num = 1
    
    while(is_true):
        lcm = max(arr) * num
        for i in arr:
            if lcm%i != 0:
                break
        else:
            is_true = False
        num += 1
        
    return lcm