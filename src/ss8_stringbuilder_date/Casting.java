package ss8_stringbuilder_date;

public class Casting {
    public static void main(String[] args) {
        // Ngầm định: Việc chuyển đổi sẽ tự thực hiện bởi compiler
        byte b = 10; // [-128:127]
        short s = b;

        // Tường minh: Việc chuyển đổi phải có sự can thiệp của lập trình viên
        int i = 1000;
        byte b2 = (byte) i;
        System.out.println("b2 = " + b2);

    }
}
