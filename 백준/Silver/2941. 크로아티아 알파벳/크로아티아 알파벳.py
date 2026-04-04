user_input = input()
al_list = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in al_list:
    user_input = user_input.replace(i, "*")
print(len(user_input))