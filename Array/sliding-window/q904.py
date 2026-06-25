class Solution(object):
    def totalFruit(self, fruits):
        """
        :type fruits: List[int]
        :rtype: int
            """
        if not fruits:
            return 0

        m = 0  
        w = 0  
        a = 0  
        b = 0  
        s = 0 
        
        for f in fruits:
            if f == a:
                s += 1
                w += 1
                
            elif f == b:
                s = 1
                b = a
                a = f
                w += 1
                
            else:
                if w > m:
                    m = w
                w = s + 1
                s = 1
                b = a
                a = f
                
        return max(w,m)
