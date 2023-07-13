package ss6_method;

public class PassByValue {
    static int a;

    public static void main(String[] args) {
        a = 10;
        changeData();

        System.out.println("a = " + a);
    }

    public static void changeData() {
        a = 100;
    }
}
