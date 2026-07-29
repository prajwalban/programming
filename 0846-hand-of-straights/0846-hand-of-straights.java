class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        if(hand.length%groupSize!=0){
            return false;
        }
        for(int i : hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Arrays.sort(hand);
        for(int card:hand){
            if(map.get(card)==0){
                continue;
            }
        

            for(int i=0;i<groupSize;i++){
                if(map.getOrDefault(card+i,0)==0){
                    return false;
                }
                    map.put(card+i,map.get(card+i)-1);
                }
        }
             
            
        
        return true;
    }
}