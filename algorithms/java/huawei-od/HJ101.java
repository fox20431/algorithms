import java.util.Scanner;

public class HJ101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        int type = in.nextInt();

        // 冒泡
        // 0 ascending
        StringBuilder stringBuilder = new StringBuilder();
        if (type == 0) {
            int[] ascendingArr = ascending(arr);
            for (int i : ascendingArr) {
                stringBuilder.append(i).append(" ");
            }
        }
        // 1 descending
        if (type == 1) {
            int[] descendingArr = descending(arr);
            for (int i : descendingArr) {
                stringBuilder.append(i).append(" ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder);
    }

    static int[] ascending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int[] descending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] < arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
