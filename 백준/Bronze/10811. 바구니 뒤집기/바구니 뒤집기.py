N, M = [int(i) for i in input().split()]
list_num = [i+1 for i in range(N)]

for _ in range(M):
    i, j = [int(x) for x in input().split()]
    list_num[i-1:j] = list_num[i-1:j][::-1]

print(*list_num)