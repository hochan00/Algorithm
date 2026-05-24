def solution(absolutes, signs):
    return sum(val if sign else -val for val, sign in zip(absolutes, signs))