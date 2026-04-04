N, M = [int(i) for i in input().split()]
list_num = [0 for _ in range(N)]

for _ in range(M):
    i, j, k = [int(i) for i in input().split()]
    for x in range(i-1, j):
        list_num[x] = k

print(*list_num)