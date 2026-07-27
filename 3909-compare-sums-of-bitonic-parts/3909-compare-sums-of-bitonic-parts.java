class Solution {
    public int compareBitonicSums(int[] nums) {
        long acc=0;
        long dec=0;
        int count=0;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]<nums[i+1]){
                acc+=nums[i];
                count=count+1;
            }
        }
        for(int j=count;j<=nums.length-1;j++){
            dec+=nums[j];
        }
        if(acc+nums[count]>dec){
            return 0;
        }
        else if(dec>acc+nums[count]){
          return 1;
        }

        else{
        return -1;
        }
    }
}