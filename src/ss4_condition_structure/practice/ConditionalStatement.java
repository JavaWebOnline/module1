package ss4_condition_structure.practice;

public class ConditionalStatement {
    public static void main(String[] args) {
        // Câu lệnh điều kiện cho phép thực thi một khối lệnh nào đó
        // dựa trên giá trị đúng hoặc sai của một biểu thức điều kiện.

        /*
        Xếp loại học viên:
        Điểm < 5: Yếu
        Điểm >= 5: Khá
         */

        double score = 5.6;

        // Cách 1: Thiếu
        if (score < 5) {
            System.out.println("Yếu");
        }

        if (score >= 5) {
            System.out.println("Khá");
        }

        // Cách 2 => đủ
        if (score < 5) {
            System.out.println("Yếu");
        } else {
            System.out.println("Khá");
        }


        /*
        Xếp loại học viên:
        Điểm < 5: Yếu
        Điểm >= 5 và điểm < 8: Khá
        Điểm >= 8: Tốt
         */
        if (score < 5) {
            System.out.println("Yếu");
        } else if (score < 8) {
            System.out.println("Khá");
        } else { // >= 8
            System.out.println("Tốt");
        }
    }
}
