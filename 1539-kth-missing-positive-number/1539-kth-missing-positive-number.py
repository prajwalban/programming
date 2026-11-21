class Solution:
    def findKthPositive(self, arr, k):
        left = 0
        right = len(arr)

        while left < right:
            mid = left + (right - left) // 2

            missing = arr[mid] - (mid + 1)

            if missing < k:
                left = mid + 1
            else:
                right = mid

        return left + k