import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i = Integer.parseInt(str.substring(2), 16);
        System.out.println(i);
    }
}
