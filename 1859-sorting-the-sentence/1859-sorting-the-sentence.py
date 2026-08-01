class Solution:
    def sortSentence(self, s: str) -> str:
        s=s.split(' ')
        # print (s)
        ans = [0]*len(s)

        for i in s:
            ans[int(i[-1])-1]=i[:len(i)-1]
        s=""
        for i in ans:
            s=s+i+" "
        return s[:len(s)-1]
        