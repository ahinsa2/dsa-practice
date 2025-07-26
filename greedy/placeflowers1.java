class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, len = flowerbed.length;

        while (i < len) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) return true;
                    i += 2;  
                } else {
                    i++;  
                }
            } else {
                i += 2;  
            }
        }

        return n <= 0;
        
    }
}
