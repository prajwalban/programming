class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        h={}
        for i in stones:
            if i in h.keys():
                h[i]=h[i]+1;
            else:
                h[i]=1
        c=0;
        for i in jewels:
            if i in h.keys():
                c=c+h[i];
        return c