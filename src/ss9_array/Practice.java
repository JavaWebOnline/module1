package ss9_array;

import java.util.Scanner;

public class Practice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Bài 1: Các thao tác nhập xuất
        //   Bước 1: Nhập vào số lượng phần tử của mảng

        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn cần nhập vào số nguyên dương (n > 0), xin nhập lại!");
            }
        } while (n <= 0);

        //   Bước 2: Tạo mảng có n phần tử
        int[] arr = new int[n];

        //   Bước 3: Xây dựng phương thức nhập mảng
        inputArray(arr);
        //   Bước 4: Xây dựng phương thức xuất mảng
        outputArray(arr);

        // Bài 2: Các thao tác kiểm tra
        //      + Mảng có phải là mảng toàn chẵn?

        if(isAllEven(arr)) {
            System.out.println("Mảng toàn chẵn");
        } else{
            System.out.println("Mảng không toàn chẵn");
        }

        // Bài 3: Các thao tác tính toán
        //      + Tính tổng số dương lẻ của mảng a.

        System.out.println("Tổng số dương lẻ của mảng là: " + calculateSum(arr));

        // Bài 4: Các thao tác tìm kiếm
        //      + Vị trí cuối cùng của phần tử x trong mảng, nếu không tìm thấy trả về -1.
        int x = 2;
        int index = lastIndexOf(arr, x);

        if(index >= 0) {
            System.out.printf("Phần tử %d có vị trí cuối cùng là %d.", x, index);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    public static int lastIndexOf(int[]arr, int x) {
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }


    public static boolean isAllEven(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
