class Solution:
    def minimumSwaps(self, nums: List[int]) -> int:
        i = 0
        j = len(nums)-1
        count = 0

        while i < j:
            if nums[i] != 0:
                i += 1

            elif nums[j] == 0:
                j -= 1

            else:
                nums[i], nums[j] = nums[j], nums[i]
                count += 1
                i += 1
                j -= 1

        return count