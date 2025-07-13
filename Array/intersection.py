class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        nums2_used = [False] * len(nums2)

        for num in nums1:
            for i in range(len(nums2)):
                if not nums2_used[i] and nums2[i] == num:
                    result.append(num)
                    nums2_used[i] = True
                    break

        return result
