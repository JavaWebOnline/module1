package ss5_loop;

public class WhileLoop {
    public static void main(String[] args) {
        /*
            while: thường được sử dụng khi không biết số lần lặp
         */

        // In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
//        int n = 5;
//        int i = 1;
//        while (i <= n) {
//            System.out.println(i);
//            i++;
//        }


        int i = 0;
        while (true) {
            i++; // i = 5
            if (i % 2 == 0) {
                continue; // Bỏ qua bước lặp hiện tại
            }

            if (i % 5 == 0) {
                break; // Thoát khỏi vòng lặp
            }
            System.out.println(i); // 1 3
        }
    }
}
