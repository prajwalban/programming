class Solution:
    def maximumCount(self, nums):
        def binary(arr, target):
            left = 0
            right = len(arr)

            while left < right:
                mid = left + (right - left) // 2

                if arr[mid] < target:
                    left = mid + 1
                else:
                    right = mid

            return left

        neg = binary(nums, 0)
        pos = len(nums) - binary(nums, 1)

        return max(neg, pos)