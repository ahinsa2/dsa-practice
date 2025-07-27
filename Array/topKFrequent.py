class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums.sort()
    
    
        freq = []
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                freq.append([nums[i - 1], count])
                count = 1
        freq.append([nums[-1], count])  

    
        freq.sort(key=lambda x: x[1], reverse=True)

    
        return [item[0] for item in freq[:k]]
        
