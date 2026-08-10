class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
       
        int n =arr.length;
        int i=0;
        while(i+1<n&&arr[i]<=arr[i+1]){
            i++;

        }
        if(i==n-1){
            return 0;

        }
        int j=n-1;
        while(j>0&&arr[j-1]<=arr[j]){
            j--;
        }
        int ans=Math.min(n-i-1,j);
        int left=0;
        int right=j;
        while(left<=i&&right<n){
            if(arr[left]<=arr[right]){
                ans=Math.min(ans,right-left-1);
                left++;
            }else{
                right++;
            }

        }
        return ans;
        
    }
}