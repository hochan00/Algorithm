user_input = input()
user_input = [int(i) for i in user_input.split()]
N = user_input[0]
M = user_input[1]

list_num = [i+1 for i in range(N)]

for i in range(M):
    user_input2 = input()
    user_input2 = [int(i) for i in user_input2.split()]
    i = user_input2[0]
    j = user_input2[1]
    tmp = 0
    tmp = list_num[i-1]
    list_num[i-1] = list_num[j-1]
    list_num[j-1] = tmp

for i in list_num:
    print(i, end=' ')