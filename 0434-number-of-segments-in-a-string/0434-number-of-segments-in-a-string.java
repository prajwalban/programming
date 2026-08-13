class Solution {
    public int countSegments(String s) {
        String[]words=s.trim().split("\\s+");
        return s.trim().isEmpty()?0:words.length;
        
    }
}