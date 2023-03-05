import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String s = in.nextLine();
            boolean hasUpperChar = false;
            boolean hasLowerChar = false;
            boolean hasNum = false;
            boolean hasSym = false;
            if (s.length() > 8) {
                Pattern p1 = Pattern.compile("[A-Z]");
                Pattern p2 = Pattern.compile("[a-z]");
                Pattern p3 = Pattern.compile("[0-9]");
                Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
                if (p1.matcher(s).find()) {
                    hasUpperChar = true;
                }
                if (p2.matcher(s).find()) {
                    hasLowerChar = true;
                }
                if (p3.matcher(s).find()) {
                    hasNum = true;
                }
                if (p4.matcher(s).find()) {
                    hasSym = true;
                }
                int count = 0;
                count += hasUpperChar ? 1:0;
                count += hasLowerChar ? 1:0;
                count += hasNum ? 1:0;
                count += hasSym ? 1:0;
                if ( count >= 3) {
                    if(!getString(s, 0, 3)) {
                        System.out.println("OK");
                        return;
                    }
                }
            }
            System.out.println("NG");
        }
    }
    // 校验是否有重复子串
    private static boolean getString(String str, int l, int r) {
        if (r >= str.length()) {
            return false;
        }
        if (str.substring(r).contains(str.substring(l, r))) {
            return true;
        } else {
            return getString(str,l+1,r+1);
        }
    }
}
