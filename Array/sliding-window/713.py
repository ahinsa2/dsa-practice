class Solution(object):
    def numSubarrayProductLessThanK(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n=len(nums)
        r=0
        c=0
        p=1
        l=0
        for r in range(n):
            p *= nums[r]
            while p >= k and l <= r:
                p /= nums[l]
                l += 1
                
            c += (r - l + 1)
            
        return c
