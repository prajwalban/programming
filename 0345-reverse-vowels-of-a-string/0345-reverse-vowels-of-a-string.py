class Solution:
    def reverseVowels(self, s: str) -> str:
        a=list(s)
        i=0
        j=len(a)-1
        v='aeiouAEIOU'
        while i<j:
            while i<j and a[i] not in v:
                i+=1
            while i<j and a[j] not in v:
                j-=1
            a[i],a[j]=a[j],a[i]
            i+=1
            j-=1
        return ''.join(a)

        