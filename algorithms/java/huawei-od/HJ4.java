import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = str.length(); i > 8; i=i-8) {
            String subStr = str.substring(0, 8);
            str = str.substring(8);
            System.out.println(subStr);
        }
        for (int i = str.length(); i < 8; i++) {
            str = str.concat("0");
        }
        System.out.println(str);
    }
}
