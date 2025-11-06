public class SortingSearchingProblems {
    public static void main(String[] args) {


        int[] arr1 = {15, 7, 22, 9, 18, 4};
        int k = 3;
        System.out.println("Kth Smallest Element: " + findKthSmallest(arr1, k));

        // ---- Q2 ----
        int[] arr2 = {4, 8, 1, 2, 16, 15};
        findPairEqualToRestSum(arr2);

        // ---- Q3 ----
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Number of triangles: " + countPossibleTriangles(arr3));
    }

   
