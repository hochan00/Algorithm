user_input = input()
al_list = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
num = 0
i = 0

while i < len(user_input):
    if(user_input[i:i+3] in al_list):
        num += 1
        i += 3
    elif(user_input[i:i+2] in al_list):
        num += 1
        i += 2
    else:
        num += 1
        i += 1
print(num)