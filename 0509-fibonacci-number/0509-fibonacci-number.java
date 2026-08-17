class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
        if(n==0){
            return 0;
        }
        while(n>1){
            int next=first+second;
            first=second;
            second=next;
            n--;
        }
        
        return second;
    }
}