def solution(s):
    answer = 0
    while s:
        x = s[0]
        cnt_x = 0
        cnt_others = 0
        
        for i in range(len(s)):
            if s[i] == x:
                cnt_x += 1
            else:
                cnt_others += 1
            
            if cnt_x == cnt_others:
                break
        
        answer += 1
        s = s[i+1:]
        
    return answer