public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[128];  // For ASCII characters
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character was seen in current window, move left pointer
            while (seen[currentChar] > 0) {
                seen[s.charAt(left)]--;
                left++;
            }

            seen[currentChar]++;
            int windowLength = right - left + 1;
            if (windowLength > maxLength) {
                maxLength = windowLength;
            }
        }

        return maxLength;
    }
}
