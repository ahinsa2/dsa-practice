public class PairEqualToRest {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 2, 16, 15};
        int n = arr.length;
        int totalSum = 0;

        // Step 1: Find total sum
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Step 2: Find pair (i, j) such that arr[i] + arr[j] = totalSum - (arr[i] + arr[j])
        // → 2 * (arr[i] + arr[j]) == totalSum
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (2 * (arr[i] + arr[j]) == totalSum) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("No such pair exists.");
    }
}
