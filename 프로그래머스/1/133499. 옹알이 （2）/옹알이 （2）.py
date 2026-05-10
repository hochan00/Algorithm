def solution(babbling):
    answer = 0
    sounds = ["aya", "ye", "woo", "ma"]
    
    for word in babbling:
        for s in sounds:
            # 같은 발음이 연속되면 발음할 수 없음
            if s * 2 in word:
                break
            # 발음 가능한 단어를 공백으로 치환 (문자가 합쳐지는 것 방지)
            word = word.replace(s, " ")
        else:
            # 모든 치환 후 공백만 남았다면 조카가 발음할 수 있는 단어
            if word.strip() == "":
                answer += 1
                
    return answer