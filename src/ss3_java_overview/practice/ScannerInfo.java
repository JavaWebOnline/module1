package ss3_java_overview.practice;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        // System.in: là một tiêu chuẩn để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm: ");
//        double score = scanner.nextDouble(); //9.6 enter
        double score = Double.parseDouble(scanner.nextLine());
//        Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào tên của bạn: ");
//        scanner.nextLine(); // xóa hết dữ liệu
        String name = scanner.nextLine();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Điểm của bạn là: " + score);

    }
}
