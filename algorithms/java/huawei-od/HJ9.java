import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        String reverseString = stringBuilder.toString();
        ArrayList<Character> res = new ArrayList<>();
        for (int i = 0; i < reverseString.length(); i++) {
            char c = reverseString.charAt(i);
            if (res.contains(c)) {
                continue;
            }
            res.add(c);
        }
        for (char c : res) {
            System.out.print(c);
        }
    }
}
