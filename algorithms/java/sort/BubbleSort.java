import java.util.Arrays;

// 冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        // the array to be sorted
        int[] arr = {4, 3, 5, 7, 9, 6};
        for (int i = 0; i < arr.length - 1; i++ ) { // every time this loop is executed, a maximum value will be selected, the last value is naturally correct
            // whether it is ordered, ordered by default, disordered when exchange occurs
            boolean ordered = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ordered = false;
                }
            }
            if (ordered) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
