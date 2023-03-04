// 插入排序

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 2, 5};
        // 从第二个元素开始，默认第一个元素有序
        for (int i = 1; i < arr.length; i++ ){
            // 记录要插入的元素
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j-1]; // 值在数组顺序中右移，为插入的位置留出空间
                j--;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
