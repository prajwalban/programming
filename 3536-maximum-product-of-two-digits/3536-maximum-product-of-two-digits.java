class Solution {
    public int maxProduct(int n) {
        int num=n;
        int first=0;
        int second=0;
        while(num>0){
            int digits=num%10;
            num=num/10;
            if(digits>first){
                second=first;
                first=digits;
            }else if(digits>second){
                second=digits;
            }
        }
        return first*second ;
        
    }
}