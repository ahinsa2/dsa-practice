class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        l1,l2=len(s1),len(s2)
        if l1>l2:
            return False
        cs1,cs2=[0]*26,[0]*26
        for i in range(l1):
            cs1[(ord(s1[i]))-ord('a')]+=1
            cs2[(ord(s2[i]))-ord('a')]+=1
        if(cs1==cs2):
            return True
        for i in range(l1,l2):
            cs2[(ord(s2[i])-ord('a'))]+=1
            cs2[(ord(s2[i-l1])-ord('a'))]-=1
            if (cs1==cs2):
                return True
        return False  
