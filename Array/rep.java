import java.util.HashSet;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int result = findFirstRepeated(arr);
        if (result != -1)
            System.out.println("First repeated element: " + result);
        else
            System.out.println("No repeated elements found.");
    }

    static int findFirstRepeated(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}
