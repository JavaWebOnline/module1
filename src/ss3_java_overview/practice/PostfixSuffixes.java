package ss3_java_overview.practice;

public class PostfixSuffixes {
    public static void main(String[] args) {
        // Toán tử ++: tăng 1 đơn vị
        // Toán tử --: giảm 1 đơn vị

        //Cách sử dụng toán tử ++ và -- được chia thành hai loại:
        // 1. Hậu tố: Được ký hiệu là "++" hoặc "--" đặt sau biến.
                       // => Thực hiện biểu thức => Giá trị biến thay đổi.
        // 2. Tiền tố
                       // => Giá trị biến thay đổi => Thực hiện biểu thức.

//        int a = 5;
//        int b = ++a;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


        int a = 2;
        int b = a++ + a--; // a = 2
        //    = 2   +   3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
