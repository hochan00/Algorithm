def solution(numbers):
    total = 0
    for i in range(len(numbers)):
        total += numbers[i]
    answer = total / len(numbers)
    return answer