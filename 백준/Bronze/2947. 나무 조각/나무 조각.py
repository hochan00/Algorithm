nums = [int(i) for i in input().split()]

while nums != [1, 2, 3, 4, 5]:
    for i in range(0, len(nums)):
        if i<4 and nums[i] > nums[i+1]:
            nums[i], nums[i+1] = nums[i+1], nums[i]
            for x in range(len(nums)):
                print(nums[x], end=' ')
            print("")

