class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        alls=sum(nums)
        s=0
        n=len(nums)
        for i in range (n):
            if s==alls-s-nums[i]:
                return i
            s+=nums[i]
        return -1
