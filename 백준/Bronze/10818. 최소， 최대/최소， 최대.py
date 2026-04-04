user_input = int(input())
user_input2 = input()
user_input2 = user_input2.split(" ")
user_input2 = [int(i) for i in user_input2]
print(min(user_input2), max(user_input2))