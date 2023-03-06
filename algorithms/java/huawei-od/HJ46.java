import java.util.Scanner;

public class HJ46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = in.nextInt();
        String substring = s.substring(0, i);
        System.out.println(substring);
    }
}
