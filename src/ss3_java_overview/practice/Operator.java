package ss3_java_overview.practice;

public class Operator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int sum = a + b;
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + ((double)a / b));
        System.out.println("Chia lấy dư: " + a % b);

        int x = 10;
        // Tăng x lên 10 đơn vị
        // x = x + 10;
        x += 10; //  x = x + 10;
        System.out.println("x = " + x);
    }
}
