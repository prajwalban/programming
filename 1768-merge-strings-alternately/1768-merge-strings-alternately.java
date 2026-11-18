class Solution {
    public String mergeAlternately(String a, String b) {
        int max= Math.max(a.length(),b.length());
        String result="";
         for (int i=0;i<max;i++){
            if(i<a.length()){
                result=result+a.charAt(i);
            }
             if(i<b.length()){
                result=result+b.charAt(i);
            }
         }
      return result;
        
    }
}