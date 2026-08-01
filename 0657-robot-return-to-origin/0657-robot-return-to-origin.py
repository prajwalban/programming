class Solution:
    def judgeCircle(self, moves: str) -> bool:
        u,l,d,r=0,0,0,0
        c=0;
        for i in moves:
            if i == "U":
              u=u+1
            elif i == "L":
             l = l+1
            elif i == "R":
             r = r+1
            elif i == "D":
             d = d+1
        return (l-r==0 and u-d==0)



        