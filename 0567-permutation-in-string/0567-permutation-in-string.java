class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] need = new int[26];
        int [] window = new int[26]; 

        for(char c :s1.toCharArray()){
            need[c-'a']++;
        }
        int left=0;
        for (int right = 0; right < s2.length(); right++) {

            char c = s2.charAt(right);
            window[c - 'a']++;
             if (right - left + 1 > s1.length()) {
                char lc = s2.charAt(left);
                window[lc - 'a']--;
                left++;
            }
            if (Arrays.equals(window, need)) {
                return true;
        
    
    }
}
             return false;
    }
}