class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = [0] * 128 
        left = 0
        max_length = 0

        for right in range(len(s)):
            char = s[right]

           
            while seen[ord(char)] > 0:
                seen[ord(s[left])] -= 1
                left += 1

            seen[ord(char)] += 1
            window_length = right - left + 1
            if window_length > max_length:
                max_length = window_length

        return max_length
