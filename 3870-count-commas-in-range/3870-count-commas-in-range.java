class Solution {
    public int countCommas(int n) {
        int ans=0;
        for(int i=0;i<=n;i++){
            int digits=0;
            int temp=i;
            while(temp>0){
                temp=temp/10;
                digits++;
            }
            if(i==10000){
                System.out.println(digits);
            }
            if(digits>3){
                ans+=(digits-1)/3;
            }

        }
        return ans;
    }
}