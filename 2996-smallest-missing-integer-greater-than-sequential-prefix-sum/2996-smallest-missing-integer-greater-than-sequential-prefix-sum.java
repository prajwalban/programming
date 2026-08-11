class Solution {
    public int missingInteger(int[] nums) {
       long prefixsum=nums[0];
        HashSet<Long> set=new HashSet<>();
       for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1] + 1) {
              prefixsum += nums[i];
            } else {
                      break;
             }


        }
        for(int i:nums){
            set.add((long) i);
        }
        while(set.contains(prefixsum)){
            prefixsum++;
        }
        return (int) prefixsum;
        
    }
}