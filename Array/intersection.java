class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         boolean[] used = new boolean[nums2.length];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!used[j] && nums1[i] == nums2[j]) {
                    temp[index++] = nums1[i];
                    used[j] = true;
                    break;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }
