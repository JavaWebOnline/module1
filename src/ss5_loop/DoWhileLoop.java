package ss5_loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
         /*
            do-while: Lặp ít nhất một lần
         */

        // In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
//        int n = 5;
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= n);

        // Kiểm tra đầu vào người dùng
        // Nhập vào số nguyên dương

        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();

            if(n <= 0) {
                System.out.println("Bạn cần nhập vào số nguyên dương (n > 0), xin nhập lại!");
            }
        } while (n <= 0);

        System.out.println("n = " + n);
    }
}
