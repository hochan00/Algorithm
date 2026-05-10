def solution(a, b, n):
    answer = 0
    while n >= a:
        new_coke = (n // a) * b
        answer += new_coke
        n = (n % a) + new_coke
    return answer