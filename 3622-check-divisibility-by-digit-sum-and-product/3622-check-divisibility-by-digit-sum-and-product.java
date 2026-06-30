class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
         int sum = 0;
         int pro = 1;
        while(n!=0){
           int  r = n %10;
            n = n/10;
             sum = sum+r;
            pro = pro*r;

        }
        int cal = sum+pro;
        if(x%cal==0){
            return true;
        }
       return false; 
    }
}