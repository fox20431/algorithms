// 计算某字符出现次数

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // 获取获取字符串
        String str = in.nextLine().toLowerCase();
        // 获取字符
        char ch = Character.toLowerCase(in.next().charAt(0));
        char[] chars = str.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (ch == c) {
                i++;
            }
        }
        System.out.println(i);
    }
}
