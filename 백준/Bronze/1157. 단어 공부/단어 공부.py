user_input = input()
user_input = user_input.upper()

s = set(user_input)
max_num = 0
s_num = 0
answer = ""
for i in s:
    s_num = user_input.count(i)
    if s_num > max_num:
        max_num = s_num
        answer = i
    elif s_num == max_num:
        answer = "?"

print(answer)
