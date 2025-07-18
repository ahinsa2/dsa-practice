class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq = [0] * 26  # For 'a' to 'z'

        for char in s:
            freq[ord(char) - ord('a')] += 1

        for i in range(len(s)):
            if freq[ord(s[i]) - ord('a')] == 1:
                return i
        
        return -1
