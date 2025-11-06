public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {15, 7, 22, 9, 18, 4};
        int n = arr.length;

        heapSort(arr, n);

        System.out.print("Sorted array: ");
        for (int val : arr) System.out.print(val + " ");
    }

    static void heapSort(int[] arr, int n) {
        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Step 2: Extract elements
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
