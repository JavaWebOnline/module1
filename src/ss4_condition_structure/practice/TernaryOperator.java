package ss4_condition_structure.practice;

public class TernaryOperator {
    public static void main(String[] args) {
        // Toán tử 3 ngôi cung cấp một cách ngắn gọn để viết một câu lệnh if-else

        // biến = <điều kiện> ? <biểu thức 1> : <biểu thức 2>

        // Tìm max của 2 số a, b;

        int a = 2;
        int b = 3;

//        int max;
//
//        if(a > b) {
//            max = a;
//        } else {
//            max = b;
//        }

        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
