def solution(number, limit, power):
    divisors = [0] * (number + 1)
    for i in range(1, number + 1):
        for j in range(i, number + 1, i):
            divisors[j] += 1
    
    answer = 0
    for count in divisors[1:]:
        if count > limit:
            answer += power
        else:
            answer += count
            
    return answer