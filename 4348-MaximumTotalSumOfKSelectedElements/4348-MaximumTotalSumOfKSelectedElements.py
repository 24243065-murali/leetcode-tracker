# Last updated: 09/07/2026, 10:06:20
class Solution:
    def maxSum(self, nums: list[int], k: int, mul: int) -> int:
        nums.sort(reverse=True)
        n = len(nums)

        prefix = [0] * (n + 1)
        for i in range(n):
            prefix[i + 1] = prefix[i] + nums[i]

        ans = 0
        mult_sum = 0
        limit = min(k, mul)

        for t in range(limit + 1):
            ans = max(ans, mult_sum + (prefix[k] - prefix[t]))
            if t == limit:
                break
            mult_sum += nums[t] * (mul - t)

        return ans