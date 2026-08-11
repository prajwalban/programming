class Solution {
    List<List<Integer>> ans = new ArrayList<>();
     int[] candidates;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates=candidates;
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
       backtrack(0,target,current);
        return ans;
        
    }
    
    void backtrack(int index,int remaining,List<Integer> current){
        if (remaining == 0) {
    ans.add(new ArrayList<>(current));
    return;
        }
    
    if (remaining < 0) {
      return;
     }
    for(int i=index;i<candidates.length;i++){
        if (i > index && candidates[i] == candidates[i - 1]) {
          continue;
          }
            current.add(candidates[i]);
            backtrack(i+1,remaining-candidates[i],current);
        current.remove(current.size()-1);
    }
    }
}