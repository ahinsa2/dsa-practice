class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n=len(height)
        l=0
        r=n-1
        maxl=height[l]
        maxr=height[r]
        w=0
        while(l<r):
            if (maxl<maxr):
                l+=1
                maxl=max(maxl,height[l])
                w+=maxl-height[l]
            else:
                r-=1
                maxr=max(maxr,height[r])
                w+=maxr-height[r]
        return w
