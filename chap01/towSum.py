def two(nums, target):
    n = len(nums)
    for i in range(n): 
        for j in range(n):
            if nums[i] + nums[j] == target:
                return True
    return False

print(two(nums=[4,1,9,7,5,3,16], target=14))
    