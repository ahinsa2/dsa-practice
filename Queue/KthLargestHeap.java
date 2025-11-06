public class KthLargestHeap {
    public static void main(String[] args) {
        int[] arr = {15, 7, 22, 9, 18, 4};
        int k = 3;

        int n = arr.length;
        buildMaxHeap(arr, n);

        for (int i = 1; i < k; i++) {
            deleteMax(arr, n--);
        }

        System.out.println(k + "rd largest element: " + arr[0]);
    }

    static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i]; arr[i] = arr[largest]; arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    static void deleteMax(int[] arr, int n) {
        arr[0] = arr[n - 1];
        heapify(arr, n - 1, 0);
    }
}
