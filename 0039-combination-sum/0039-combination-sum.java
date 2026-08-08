class Solution {
    int[] candidates;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates=candidates;
       List<Integer> current = new ArrayList<>();
        backtrack(0,target,current);


          return ans;  
        
    }
    private void backtrack(int index, int remaining,List<Integer> Current){
       
        if(remaining==0){
            ans.add(new ArrayList<>(Current));
            return;
        }
        if (remaining < 0) {
        return;
        }
        for(int i = index ; i<candidates.length;i++){
            Current.add(candidates[i]);
            backtrack(i,remaining-candidates[i],Current);
            Current.remove(Current.size()-1);
        }
        
    }
}