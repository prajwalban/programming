class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character,String > map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
       
           if(pattern.length()!=words.length){
                return false;
            }
            for(int i = 0; i < pattern.length(); i++){
                char ch = pattern.charAt(i);
                String word = words[i];
                if(map.containsKey(ch)){
                       if(!map.get(ch).equals(word)){
                       return false;
                       }
                }else{
                    if(set.contains(word)){
                    return false;
                 }

                    map.put(ch, word);
                   set.add(word);
}

            }
            
      return true ;
        
    
}
}