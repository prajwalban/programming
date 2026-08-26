class Solution {
    public String getHint(String secret, String guess) {
        int [] sfreq = new int[10];
        int [] gfreq = new int[10];
        int bulls=0;
        for(int i=0;i < secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
        }
        for(int i=0;i < secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                sfreq[secret.charAt(i)-'0']++;
                gfreq[guess.charAt(i)-'0']++;
                
            }
        }
        int cows=0;
        for(int i=0;i<10;i++){
            cows+=Math.min(sfreq[i],gfreq[i]);
        }
        return bulls+ "A" + cows+"B";
        
    }
}