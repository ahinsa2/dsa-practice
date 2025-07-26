class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        i = 0
        length = len(flowerbed)
        while i < length:
            if flowerbed[i] == 0:
                empty_left = (i == 0 or flowerbed[i - 1] == 0)
                empty_right = (i == length - 1 or flowerbed[i + 1] == 0)

                if empty_left and empty_right:
                    flowerbed[i] = 1
                    n -= 1
                    if n == 0:
                        return True
                    i += 2  
                else:
                    i += 1
            else:
                i += 2  

        return n <= 0
