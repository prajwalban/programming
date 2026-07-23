class Solution {
    public int[] sortArray(int[] nums) {
        int left =0;
        int right = nums.length-1;
        mergesort(nums,left,right);
        return nums;       
    }
    private void mergesort(int [] nums,int left,int right){
        if(left<right){
             int mid=left+(right-left)/2;
             mergesort(nums,left,mid);
             mergesort(nums,mid+1,right);
             merge(nums,left,mid,right);

        }

    }
    private void merge(int [] nums,int left,int mid,int right){
        int [] b =new int [right-left+1];
        int i = left;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                b[k]=nums[i];
                i++;
                k++;
            }else{
                b[k]=nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            b[k]=nums[i];
            i++;
            k++;
        }
        while(j<=right){
            b[k]=nums[j];
            j++;
            k++;
        }
        i =left;
          k=0;
        while(i<=right){
            nums[i]=b[k];
            i++;
            k++;
        }
    }
}