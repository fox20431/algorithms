import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int min = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (min == 0) {
                min = entry.getValue();
            }
            if (min > entry.getValue()) {
                min = entry.getValue();
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == min) {
                s = s.replace(entry.getKey().toString(), "");
            }
        }
        System.out.println(s);
    }
}
