class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        nums.sort()
        m=0
        for i in range(1,len(nums)):
            m=max(nums[i]-nums[i-1],m)
        return m

        