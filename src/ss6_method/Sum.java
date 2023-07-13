package ss6_method;

public class Sum {
//    <access modifier> <static/non-static> <return type> <method name> (
//        // Method body
//    }
    public static void main(String[] args) {
        // Viết phương thức tính tổng 2 số
        double x = 2;
        double y = 3;
        double z = 4;

        double total = calculateSum(x, y); // a, b được gọi là đối số

        // Tính tổng 3 số?
        total = calculateSum(total, z);

        System.out.println("Tổng: " + total);
    }

    public static double calculateSum(double a, double b) { // a, b được gọi là tham số
        double sum = a + b;
        return sum;
    }

//    public static void calculateSum(double a, double b) { // a, b được gọi là tham số
//        double sum = a + b;
//        System.out.println("Tổng: " + sum);
//    }
}
