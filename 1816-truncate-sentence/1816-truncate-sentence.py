class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        s=s.split(' ')
        x=0
        ans=""
        for i in range(k):
            ans=ans+s[i]+" "
        return ans [:len(ans)-1]
        