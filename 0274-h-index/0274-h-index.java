class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for(int i=0;i<citations.length;i++){
        int count = citations.length - i;
        if(citations[i]>=count){
            h=Math.max(h,count);
        }
        }
        return h;
        
    }
}