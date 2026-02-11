class Solution:
    def reverse(self, x: int) -> int:
        y=0
        if x<0:
            s=-1
            n=-x
        else:
            s=1
            n=x
        while n>0:
            y=y*10+n%10
            n//=10
        out = y*s
        if (out<2**31 and out>=-(2**31)):
            print(2**31,-2e31)
            return out
        else:
            return 0