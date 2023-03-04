import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        int i = (int)d;
        double r = d - i;
        if (r >= 0.5) {
            i = i+1;
            System.out.println(i);
        } else {
            System.out.println(i);
        }
    }
}
