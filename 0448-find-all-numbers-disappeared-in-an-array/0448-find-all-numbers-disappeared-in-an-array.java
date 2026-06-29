class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
        
    }
}