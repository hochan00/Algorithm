user_input = int(input())
if (user_input%4 == 0 and user_input%100 != 0) or user_input%400==0:
    print(1)
else:
    print(0)