class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int p =0;
        int ne=0;
        for(int num : nums){
    if(num > 0){
        pos[p++] = num;
    }else{
        neg[ne++] = num;
      }
}
    int j=0;
    for(int i=0;i<pos.length;i++){
        nums[j]=pos[i];j++;
        nums[j]=neg[i];j++;

    }
    return nums;
        
    }
}