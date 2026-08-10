class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count= new int[121];
        for(int age:ages){
            count[age]++;
        }
        int ans=0;
        for(int x=1;x<=120;x++){
            if(count[x]==0){
                continue;
            }
        
        for(int y= (int)(0.5*x+7)+1;y<=x;y++){
            if(count[y]==0){
                continue;
            }
            ans+=count[x]*count[y];
        
        if(x==y){
            ans-=count[x];
        }
        }
        }
        return ans;
        
    }
}