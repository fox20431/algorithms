// 计算某字符出现次数

import java.util.Scanner;

public class HJ2V1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // 获取获取字符串
        String str = in.nextLine().toLowerCase();
        // 获取字符
        String c = in.next().toLowerCase();
        int i = str.length() - str.replaceAll(c, "").length();
        System.out.println(i);
    }
}
