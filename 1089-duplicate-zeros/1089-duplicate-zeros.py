class Solution:
    def duplicateZeros(self, arr: list[int]) -> None:
        result = []

        for i in arr:
            if i == 0:
                if len(result) < len(arr):
                    result.append(0)
                if len(result) < len(arr):
                    result.append(0)
            else:
                if len(result) < len(arr):
                    result.append(i)

        arr[:] = result