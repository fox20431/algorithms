import java.util.Scanner;

public class HJ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(";");
        // init the coordinate
        int x = 0;
        int y = 0;
        for (String string: strings) {
            // skip adjusting the empty string and a character only
            if (string.length() <= 1 || string.length()>3) {
                continue;
            }
            // skip wrong format
            char direction = string.charAt(0);
            if (!(direction == 'A'|| direction == 'D' || direction == 'W' || direction == 'S')) {
                continue;
            }
            // determine whether it is valid data
            boolean valid = true;
            for (int i = 1; i < string.length(); i++) {
                if (!((int)string.charAt(i) <= (int)'9' && string.charAt(i) >= (int)'0')) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                string = string.substring(1);
                int num = Integer.parseInt(string);
                switch (direction) {
                    case 'A':
                        x -= num;
                        break;
                    case 'D':
                        x += num;
                        break;
                    case 'W':
                        y += num;
                        break;
                    case 'S':
                        y -= num;
                        break;
                }
            }
        }
        System.out.println(x + "," + y);
    }
}
