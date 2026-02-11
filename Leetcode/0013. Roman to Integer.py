class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        out=0
        d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        i=1
        while i<len(s):
            if d[s[i-1]]>=d[s[i]]:
                out+=d[s[i-1]]
                i+=1
            else:
                out+=d[s[i]] - d[s[i-1]]
                i+=2
        if i==len(s):
            out+=d[s[len(s)-1]]
        return out