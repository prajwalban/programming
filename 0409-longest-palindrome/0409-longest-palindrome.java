class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        boolean oddFound = false;
        HashMap<Character,Integer> map = new HashMap<>();
        for( char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int freq: map.values()){
            if(freq%2==0){
                length+=freq;
            }else{
                length+=freq-1;
                oddFound=true;
            }

        } 
        if(oddFound){
            length++;
        }  
        return length;     
    }
}