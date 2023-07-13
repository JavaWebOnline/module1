package ss7_debug_string;

public class StringStudy {
    public static void main(String[] args) {
        // equals()/equalsIgnoreCase(): Kiểm tra hai chuỗi giống nhau không
        System.out.println("Hello".equals("helle")); //false
        System.out.println("Hello".equalsIgnoreCase("Hello")); //true

        // length(): Trả về chiều dài chuỗi
        System.out.println("Hello".length()); // 5

        // concat():  Nối hai chuỗi thành một chuỗi mới (Giống với +)
        System.out.println("Hello".concat(" World")); //Hello World
        System.out.println("Hello" + " World"); //Hello World

        // charAt(int index): Trả về ký tự tại vị trí index trong chuỗi
        char c = "Hello".charAt(2); // 'l'

        // replace()/replaceAll(): Thay thế
        System.out.println("Hello".replace("l", "d"));

        // substring(): trích xuất chuỗi con
        // toLowerCase()/toUpperCase(): Thường/Hoa
        // trim(): Ngắt bỏ khoảng trắng ở đầu và cuối chuỗi

        // split(String regex): Cắt chuỗi thành mảng con
        String str = "Hạnh, Hoài, Hoa";
        String[] names = str.split(", "); //[Hạnh, Hoài, Hoa]


        int a = 2;
        int b = 3;

        // 2 + 3 = 5
        String s1 = a + " + " + b + " = " + (a + b);
        String s2 = String.format("%d + %d = %d", a, b, a + b);
    }
}
