from itertools import combinations

def solution(number):
    answer = 0
    # number 배열에서 3개를 뽑는 모든 조합을 확인
    for combo in combinations(number, 3):
        if sum(combo) == 0:
            answer += 1
            
    return answer