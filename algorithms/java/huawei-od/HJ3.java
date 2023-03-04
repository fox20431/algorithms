// 明明的随机数

import java.util.*;

public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n];
        // 将输入的所有数据构建成一个数组
        for(int i = 0; i < n; i++) {
            ints[i] = in.nextInt();
        }
        // 构建新的数组，用于过滤重复的元素
        ArrayList<Integer> newInts = new ArrayList<>();
        for(int i : ints) {
            if(!newInts.contains(i)) {
                newInts.add(i);
            }
        }
        // 对数字进行排序
        Collections.sort(newInts);
        for(Integer i : newInts ){
            System.out.println(i);
        }
    }
}
