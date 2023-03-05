import java.util.Scanner;


// 注意数值范围！！！
// long, not int

public class HJ33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        Long num = Long.parseLong(in.nextLine());
        System.out.println(ip2num(ip));
        System.out.println(num2ip(num));
    }

    static long ip2num (String ip) {
        String[] strings = ip.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            int sub = Integer.parseInt(string);
            StringBuilder subBinStr = new StringBuilder(Integer.toBinaryString(sub));
            int subLength = subBinStr.length();
            for (int i = 0; i< 8 - subLength; i ++) {
                subBinStr.insert(0, "0");
            }
            stringBuilder.append(subBinStr);
        }
        return Long.parseLong(stringBuilder.toString(), 2);
    }

    static String num2ip (long num) {
        String binString = Long.toBinaryString(num);
        // IP地址二进制长度32，整数转二进制长度未满32左填充0
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(binString);
        if (binString.length() < 32) {
            for (int i = 0; i < 32 - binString.length(); i++) {
                stringBuilder.insert(0, 0);
            }
        }
        String fullBinString = stringBuilder.toString();
        StringBuilder res = new StringBuilder();
        // 分段并转换成十进制
        for (int i = 0; i < 4; i++) {
            res.append(Integer.parseInt(fullBinString.substring(8 * i, 8 + 8*i), 2));
            res.append(".");
        }
        // 删除多余的`.`
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
