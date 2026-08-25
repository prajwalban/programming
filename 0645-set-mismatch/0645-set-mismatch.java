class Solution {
    public int[] findErrorNums(int[] nums) {
       int n=nums.length;
        int[] freq= new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        int dupl=0;
        int miss=0;
        for(int i=0;i<=n;i++){
            if(freq[i]==2){
                dupl=i;
            }
            if(freq[i]==0){
                miss=i;
            }
        }
       return new int[]{dupl,miss};
    }
}