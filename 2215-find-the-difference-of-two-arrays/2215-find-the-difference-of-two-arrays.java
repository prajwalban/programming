class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num1:nums2){
            set2.add(num1);
        }
        List<Integer>list=new ArrayList<>();
         List<Integer>list1=new ArrayList<>();
        
        for(int num:set1){
            if(!set2.contains(num)){
                list.add(num);
            }
        }
        for(int num:set2){
            if(!set1.contains(num)){
                list1.add(num);
            }
        }
        
        return Arrays.asList(list,list1);
    }
}