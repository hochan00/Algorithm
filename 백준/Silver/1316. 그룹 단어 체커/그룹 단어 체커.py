i = int(input())
n = 0

for _ in range(i):
    word = input()
    for j in range(len(word)):
        if word[j] != word[j-1] and word[j] in word[:j]:
            break
        if j == len(word)-1:
            n += 1

print(n)