class Solution {
    public int shipWithinDays(int[] weights, int D) {
       int left = 0;
           int right = 0;

        for (int w : weights) {
         left = Math.max(left, w);
           right += w;
       }
        while(left<=right){
            int mid = (left+right)/2;
            int days =1;
            int currentWeight=0;
            for(int i=0;i<weights.length;i++){
            if(currentWeight+weights[i]<=mid){
                currentWeight+=weights[i];
            }else{
               days++;
               currentWeight=weights[i]; 
            }
            }
            if (days <= D) {
                right = mid - 1;
              } else {
            left = mid + 1;
            }

        }
        return left;
    }
}