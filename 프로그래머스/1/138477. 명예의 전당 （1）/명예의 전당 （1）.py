import heapq

def solution(k, score):
    answer = []
    h = []
    
    for s in score:
        heapq.heappush(h, s)
        if len(h) > k:
            heapq.heappop(h)
        answer.append(h[0])
        
    return answer