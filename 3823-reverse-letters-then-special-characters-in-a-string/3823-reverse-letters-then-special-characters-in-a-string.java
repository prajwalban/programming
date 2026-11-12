class Solution {
    public String reverseByType(String s) {
        char [] ch = s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            while(i<j&&!Character.isLetter(ch[i])){
                i++;
            }
            while(i<j&&!Character.isLetter(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
            i=0;
             j=ch.length-1;
            while(i<j){
            while(i<j&&Character.isLetter(ch[i])){
                i++;
            }
             while(i<j&&Character.isLetter(ch[j])){
                j--;
            }
            char temp1=ch[i];
            ch[i]=ch[j];
            ch[j]=temp1;
            i++;j--;
            }
        
        return new  String(ch);
    }
}