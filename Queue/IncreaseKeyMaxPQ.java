public class IncreaseKeyMaxPQ {
    public static void main(String[] args) {
        int[] heap = {8, 5, 7, 4, 1, 6, 3, 2}; // max heap
        int index = 5; // Increase key of element at index 5 (value = 6)
        int newValue = 10;

        increaseKey(heap, index, newValue);
        printHeap(heap);
    }

    static void increaseKey(int[] heap, int i, int newValue) {
        if (newValue < heap[i]) {
            System.out.println("New key is smaller than current key!");
            return;
        }

        heap[i] = newValue;
        while (i > 0 && heap[parent(i)] < heap[i]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    static int parent(int i) { return (i - 1) / 2; }

    static void printHeap(int[] heap) {
        for (int val : heap) System.out.print(val + " ");
        System.out.println();
    }
}
