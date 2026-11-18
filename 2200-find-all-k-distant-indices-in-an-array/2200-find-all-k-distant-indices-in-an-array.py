
class Solution:
    def findKDistantIndices(self, nums, key, k):
        n = len(nums)
        visited = [False] * n

        for i in range(n):
            if nums[i] == key:
                for j in range(max(0, i-k), min(n, i+k+1)):
                    visited[j] = True

        ans = []

        for i in range(n):
            if visited[i]:
                ans.append(i)

        return ans
