nums = [int(i) for i in input().split()]

while nums != [1, 2, 3, 4, 5]:
    for i in range(len(nums)-1):
        if nums[i] > nums[i+1]:
            nums[i], nums[i+1] = nums[i+1], nums[i]
            print(*nums)