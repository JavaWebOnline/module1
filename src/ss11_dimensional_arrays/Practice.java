package ss11_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Bài 1: Các thao tác nhập/xuất
        //  + Bước 1: Nhập vào m hàng
        int m = inputPositive("m");

        //  + Bước 2: Nhập vào n cột
        int n = inputPositive("n");

        //  + Bước 3: new ra mảng có m hàng n cột
        int[][] arr = new  int[m][n];

        //  + Bước 4: Tạo phương thức nhập mảng
        inputArray(arr);
        //  + Bước 5: Tạo phương thức xuất mảng
        outputArray(arr);

        // Bài 2: Các thao tác
        //        + Mảng có phải là mảng toàn chẵn?
        if(isAllEven(arr)) {
            System.out.println("Mảng toàn chẵn");
        } else {
            System.out.println("Mảng không toàn chẵn");
        }
        //        + Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất
        //          trên từng dòng i của ma trận A. In X ra.
        System.out.println("Giá trị lớn nhấn trên mỗi dòng: " + Arrays.toString(maxValuePerRow(arr)));

        //        + Hoán đổi 2 dòng của ma trận
        swap(arr, 0, 1);
        outputArray(arr);
    }

    public static void swap(int[][] arr, int row1, int row2) {
        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

    public static int[] maxValuePerRow(int[][] arr) {
        int[] max = new  int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            max[i] = arr[i][0];
            for(int j = 1; j < arr[i].length; j++) {
                if(max[i] < arr[i][j]) {
                    max[i] = arr[i][j];
                }
            }
        }

        return max;
    }

    public static boolean isAllEven(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void outputArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void inputArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập vào arr[%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int inputPositive(String target) {
        int n;
        do {
            System.out.printf("Nhập vào %s: ", target);
            n = scanner.nextInt();

            if(n <= 0) {
                System.out.printf("Bạn cần nhập vào số nguyên dương (%s > 0), xin nhập lại!\n", target);
            }
        } while (n <= 0);

        return n;
    }
}
