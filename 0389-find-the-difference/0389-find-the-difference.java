class Solution {
    public char findTheDifference(String s, String t) {
        char sum =0;
        for(char i : s.toCharArray()){
            sum=(char)(sum^i);
        }
        for(char i : t.toCharArray()){
            sum=(char)(sum^i);
        }
        return sum;
    }
}