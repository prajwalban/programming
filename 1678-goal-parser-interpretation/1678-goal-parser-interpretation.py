class Solution:
    def interpret(self, c: str) -> str:
        s=[]
        ans=""
        for i in c:
            if i=='G':
                ans=ans+i
            elif i=='(':
                s.append(i)
            elif i==')':
                if s[-1]=='(':
                    ans= ans+'o'
                else:
                    ans=ans+'al'
           
                    s.pop()
                    s.pop()
                    s.pop()
            else:
                s.append(i)
        
        return ans

        