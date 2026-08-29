def gcd(num1, num2):
    if num2 == 0:
        return num1
    return gcd(num2, num1%num2)

def solution(n):
    answer = n*6 / gcd(n,6) / 6
    return answer