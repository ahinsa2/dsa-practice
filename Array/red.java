import java.util.Arrays;

public class ArrayReduction {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1, 2, 3, 5};
        Arrays.sort(arr);
        
        int n = arr.length;
        System.out.print("Elements left after each reduction: ");
        
        for (int i = 0; i < n; i++) {
            while (i < n - 1 && arr[i] == arr[i + 1])  // Skip duplicates
                i++;
            int remaining = n - (i + 1);
            if (remaining > 0)
                System.out.print(remaining + " ");
        }
    }
}
