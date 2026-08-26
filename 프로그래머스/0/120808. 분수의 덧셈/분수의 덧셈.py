def gcd(num1, num2):
    s = num1 % num2
    if s == 0:
        return num2
    return gcd(num2, s)

def solution(numer1, denom1, numer2, denom2):
    numer1 = numer1 * denom2
    numer2 = numer2 * denom1
    denom1 = denom1 * denom2
    
    answer_denom = denom1
    answer_numer = numer1 + numer2
    
    common_divisor = gcd(answer_denom, answer_numer)
    answer_denom = answer_denom//common_divisor
    answer_numer = answer_numer//common_divisor
    
    answer = []
    answer.append(answer_numer)
    answer.append(answer_denom)
    return answer