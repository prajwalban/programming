class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i=0;
        char[] a = s.toCharArray();
        for(char x:t.toCharArray()){

            if(i==a.length){
                break;
            }
            if(a[i]==x){
                i++;
            }
        }
        
         return i==a.length;
    }
   
}