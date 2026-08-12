class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;
      
        for(String word:words){
            int hyphenCount = 0;
              boolean valid=true;
         for (int i = 0; i < word.length(); i++) {
             char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                valid=false;
            }else if(ch=='-'){
                hyphenCount++;
                if (hyphenCount > 1 ||i == 0 || i == word.length() - 1 ||
        !Character.isLetter(word.charAt(i - 1)) ||
        !Character.isLetter(word.charAt(i + 1))) {
                valid=false;
            }
            }else if(ch=='!'||ch=='.'||ch==','|| ch==' '){
                if(i != word.length()-1){
                valid=false;
                }
            }
        }
            if(valid){
                count++;
            }
        
    }
        return count;
        
    }
}