import java.util.*;


class Solution {
    public int kmp (String S, String T) {
        int res = 0;
        int[] next = getNext(S);
        int j = 0;
        int i = 0;
        while (i < T.length()) {
            // 退到头或相等，i指针往后
            if (j == 0 || T.charAt(i) == S.charAt(j)){
                i++;
                j++;
            }
            else { // j回退，防止溢出
                j = next[j - 1];
            }
            if (j == S.length()){ // 找到一个子串，j回退
                res++;
                j = next[j - 1];
            }
        }
        return res;
    }

    int[] getNext(String S){
        int[] next = new int[S.length()];
        int j = 0;
        next[0] = 0; // 初始化
        for (int i = 1; i < S.length(); i++) {
            // 前缀不相同时；注意此处回退循环，退到相等
            while (j > 0 && S.charAt(i) != S.charAt(j))
                j = next[j - 1];
            // 前缀相同时，更新前缀指针和next数组
            if (S.charAt(i) == S.charAt(j)) {
                j++;
                next[i] = j;
            }
        }
        return next;
    }
}

public class NC149 {
    public static void main(String[] args) {
        String T = "ababcabcabababd";
        String S = "ababababc";
        Solution solution = new Solution();
        int i = solution.kmp(S, T);
        System.out.println(i);
    }
}