T = int(input())

for i in range(T):
    vps = input()
    stack = []
    is_valid = True

    for x in vps:
        if x == '(':
            stack.append(x)
        else:
            if len(stack) == 0:
                is_valid = False
                break
            else:
                stack.pop()

    if len(stack) == 0 and is_valid:
        print("YES")
    else:
        print("NO")