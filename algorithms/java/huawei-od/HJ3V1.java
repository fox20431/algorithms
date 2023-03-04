// 明明的随机数

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HJ3V1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 创建TreeSet进行去重排序
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            treeSet.add(in.nextInt());
        }
        for(Integer i : treeSet ){
            System.out.println(i);
        }
    }
}
