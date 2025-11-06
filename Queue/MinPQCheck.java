public class MinPQCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4, 6, 5, 8};
        int[] arr2 = {1, 3, 4, 7, 2, 5, 6, 8};

        System.out.println(isMinHeap(arr1) ? "YES" : "NO");
        System.out.println(isMinHeap(arr2) ? "YES" : "NO");
    }

    static boolean isMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[i] > arr[left]) return false;
            if (right < n && arr[i] > arr[right]) return false;
        }
        return true;
    }
}
