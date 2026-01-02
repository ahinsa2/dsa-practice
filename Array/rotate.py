class Solution:
    def findMin(self, nums):
        left = 0
        right = len(nums) - 1

        while left < right:
            mid = (left + right) // 2

            # If mid element is greater than right element,
            # the minimum lies in the right half
            if nums[mid] > nums[right]:
                left = mid + 1
            else:
                # Minimum lies at mid or in the left half
                right = mid

        # When left == right, it points to the minimum element
        return nums[left]
