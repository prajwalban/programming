class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> position= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                position.add(i);
            }
        }
        int[]ans= new int[queries.length];
        for(int i=0;i<queries.length;i++){
             int index = queries[i] - 1;
             if(index< position.size()){
                ans[i]=position.get(index);
             }else{
                ans[i]=-1;
             }
        }
        return ans;
    }
}