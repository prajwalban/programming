class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<=s.length()-1;i++){
            char ch =s.charAt(i);
            char ch1 = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=ch1){
                  return false;
                }
            }else{
               if(set.contains(ch1))
               return false;
            }
            map.put(ch,ch1);
            set.add(ch1);
        }
        return true;
        
    }
}