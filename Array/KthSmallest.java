public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {15, 7, 22, 9, 18, 4};
        int k = 3;
        int n = arr.length;

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(k + "rd smallest element: " + arr[k - 1]);
    }
}
