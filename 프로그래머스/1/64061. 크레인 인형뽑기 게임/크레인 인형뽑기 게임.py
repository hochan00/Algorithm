def solution(board, moves):
    stack = []
    N = len(board)
    num = 0
    
    for j in moves:
        i = 0
        while i < N-1 and board[i][j-1] == 0:
            i += 1
        if board[i][j-1] == 0:
            continue
        doll = board[i][j-1]
        board[i][j-1] = 0
        if stack and stack[-1] == doll:
            stack.pop()
            num += 2
        else:
            stack.append(doll)
        
    return num