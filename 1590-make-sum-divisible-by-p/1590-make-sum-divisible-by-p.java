class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer,Integer> map = new HashMap<>();
           long totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int target = (int)(totalSum % p);

        if(target == 0){
            return 0;
        }
        int prefix = 0;
       
        int minLen = nums.length;
          map.put(0,-1);
        for(int i = 0; i < nums.length; i++){
          prefix = (prefix + nums[i]) % p;
        
           map.put(prefix, i);
        int needed = (prefix - target + p) % p;
        if(map.containsKey(needed)){
            minLen = Math.min(minLen, i - map.get(needed));
        }
        map.put(prefix,i);
        }
          return minLen == nums.length ? -1 : minLen;
    }
}
   