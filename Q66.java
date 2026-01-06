class Q66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {

            // If digit < 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;   // remaining digits are 0 by default
        return result;
    }

    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

}
