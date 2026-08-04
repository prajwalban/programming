class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for(int num : nums){
            right = Math.max(right, num);
        }
        while(left<right){
            int mid = left +(right-left)/2;
            int operations =0;
            for(int i =0 ; i<=nums.length-1;i++){
                operations +=(nums[i]-1)/mid;
            }
                if(operations<=maxOperations){
                    right=mid;
                }else{
                    left = mid+1;
                }
            
        }
        return left;

        
    }
}