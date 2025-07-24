class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(num));  // Duplicate found
            } else {
                nums[index] = -nums[index]; // Mark as visited
            }
        }

        return result;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDuplicates(nums1)); // Output: [2, 3]

        int[] nums2 = {1,1,2};
        System.out.println(sol.findDuplicates(nums2)); // Output: [1]

        int[] nums3 = {1};
        System.out.println(sol.findDuplicates(nums3)); // Output: []
        
    }
}
