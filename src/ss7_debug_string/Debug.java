package ss7_debug_string;

public class Debug {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // Thực hiện nhiều chức năng ...

        int c = method1(a, b);

        for (int i = 1; i <= 100; i++) {
            System.out.println("Vòng lặp thứ " + i);
        }
    }

    public static int method1(int a, int b) {
        System.out.println("Đi vào phương thức method1");
        return a + b;
    }
}
