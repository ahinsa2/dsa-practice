public class CheckReverseSubarray {
    public static void main(String[] args) {
        int[] A = {1, 2, 6, 5, 4, 7};
        System.out.println(canBeSorted(A));
    }

    static boolean canBeSorted(int[] arr) {
        int n = arr.length;
        int start = -1, end = -1;

        // Find first decreasing point
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) return true; // Already sorted

        // Find last decreasing point
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        // Reverse the subarray
        reverse(arr, start, end);

        // Check if sorted now
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
