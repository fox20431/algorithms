public class LC1839 {
    public boolean isDistinct(char a, char b){
        return a!=b;
    }
    public int longestBeautifulSubstring(String word) {
        int maxLen = 0, n = word.length(), count = 1, wordLength = 1;
        for(int i = 1;i<n;i++){
            if(word.charAt(i-1) <= word.charAt(i)){
                if(isDistinct(word.charAt(i-1), word.charAt(i))){
                    count++;
                }
                wordLength++;
                if(count == 5){
                    maxLen = Math.max(maxLen, wordLength);
                }
            }
            else{
                count = 1;
                wordLength = 1;
            }
        }
        return maxLen;
    }
}

class LC1839Main {
    public static void main(String[] args) {
        LC1839 lc1839 = new LC1839();
        String s = "aaeeiiouuu";
        System.out.println(lc1839.longestBeautifulSubstring(s));
    }
}