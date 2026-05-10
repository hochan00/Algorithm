def solution(ingredient):
    stack = []
    answer = 0
    
    for i in ingredient:
        stack.append(i)
        
        # 스택의 마지막 4개 요소가 [빵, 야채, 고기, 빵] 순서인지 확인
        if len(stack) >= 4 and stack[-4:] == [1, 2, 3, 1]:
            # 햄버거가 완성되면 스택에서 제거
            for _ in range(4):
                stack.pop()
            answer += 1
            
    return answer