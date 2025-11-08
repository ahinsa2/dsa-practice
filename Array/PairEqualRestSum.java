public class PairEqualRestSum {
    public static void main(String[] args) {
        int arr[] = {4, 8, 1, 2, 16, 15};
        int sum = 0;

        for (int n : arr)
            sum += n;

        if (sum % 2 != 0) {
            System.out.println("No such pair");
            return;
        }

        int target = sum / 2;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("No such pair found");
    }
}
