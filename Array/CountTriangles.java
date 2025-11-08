import java.util.Arrays;

public class CountTriangles {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < arr.length - 1; j++) {
                while (k < arr.length && arr[i] + arr[j] > arr[k])
                    k++;
                count += (k - j - 1);
            }
        }

        System.out.println(count);
    }
}
