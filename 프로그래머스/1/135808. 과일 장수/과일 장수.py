def solution(k, m, score):
    # 1. 사과 점수를 내림차순으로 정렬
    score.sort(reverse=True)
    
    answer = 0
    # 2. m-1 인덱스부터 m 간격으로 확인 (각 상자의 가장 낮은 점수 위치)
    for i in range(m - 1, len(score), m):
        # 3. (최저 점수 * 상자당 사과 개수)를 더함
        answer += score[i] * m
        
    return answer