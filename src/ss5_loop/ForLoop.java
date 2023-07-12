package ss5_loop;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for: thường được sử dụng khi biết số lần lặp
         */

        // In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
        int n = 5;

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        /*
        i = 0 | 0 < 5 => true | 0 + 1 = 1
        i = 1 | 1 < 5 => true | 1 + 1 = 2
        i = 2 | 2 < 5 => true | 2 + 1 = 3
        i = 3 | 3 < 5 => true | 3 + 1 = 4
        i = 4 | 4 < 5 => true | 4 + 1 = 5
        i = 5 | 5 < 5 => false => thoát khỏi vòng lặp
         */
    }
}
