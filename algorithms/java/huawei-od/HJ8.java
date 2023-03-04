import java.util.*;
import java.util.stream.Collectors;

public class HJ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
