class Solution {
    public String removeDuplicateLetters(String s) {
        int [] arr = new int[26];
        for(char ch:s.toCharArray()){
           arr[ch- 'a']++;
        }
        Stack<Character>stack= new Stack<>();
        boolean[] visited =new boolean[26];
        for(char ch:s.toCharArray()){
            arr[ch- 'a']--;
            if(visited[ch- 'a']){
                continue;
            }
            while(!stack.isEmpty() &&stack.peek()>ch&&arr[stack.peek()- 'a']>0){
                visited[stack.pop()- 'a']=false;
            }
            stack.push(ch);
            visited[ch- 'a']=true;
        }
       StringBuilder result = new StringBuilder();

       for (char ch : stack) {
        result.append(ch);
        }

     return result.toString();
        
    }
}