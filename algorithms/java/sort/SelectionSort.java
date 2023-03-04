// 选择排序

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        for (int i = 0; i < arr.length -1; i++) {
            // assuming the current number is the minimum value
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) { // select the minimum number
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        System.out.println(Arrays.toString(arr));
    }
}
