class Solution {
    public String mergeAlternately(String word1, String word2) {

         char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        String c = "";
        int i = 0;
        int j=0;
        int x=0;
        while(i<arr1.length&&j<arr2.length){
        if(x%2==0){
            c=c+arr1[i];
            i++;
        }else{
            c= c+arr2[j];
            j++;
        }
        x++;
        }
        while(i<=arr1.length-1){
            c=c+arr1[i];
            i++;
        }
        while(j<=arr2.length-1){
            c=c+arr2[j];
            j++;
        }
        return c;
    }
}