class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String first = s.substring(0,n/2);
        String second = s.substring(n/2,n);
        int count1=0;
        int count2=0;

        for(int i=0;i<first.length();i++){
            char ch = first.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u' ||
                 ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

               count1++;
            }
        }
        for(int i=0;i<second.length();i++){
            char ch = second.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u' ||
                 ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

               count2++;
            }
        }
       return count1==count2; 
    }
}