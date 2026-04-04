i = int(input())
num = 0

for _ in range(i):
    word = list(input())
    exist = []
    pre = ''
    for j in range(len(word)):
        if word[j] != pre and word[j] not in exist:
            pre = word[j]
            exist.append(pre)
        elif word[j] == pre:
            continue
        else:
            num -= 1
            break
    num += 1
    
print(num)