package ss10_advanced_array;

import java.util.Arrays;

public class InterchangeSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3};
        interchangeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // Thuật toán sắp xếp đổi chổ trực tiếp
    public static void interchangeSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
