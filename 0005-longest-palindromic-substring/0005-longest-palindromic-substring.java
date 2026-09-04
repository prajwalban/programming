
class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

           
            int left = i;
            int right = i;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            String temp = s.substring(left + 1, right);

            if (temp.length() > ans.length()) {
                ans = temp;
            }


           
            left = i;
            right = i + 1;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            temp = s.substring(left + 1, right);

            if (temp.length() > ans.length()) {
                ans = temp;
            }
        }

        return ans;
    }
}

