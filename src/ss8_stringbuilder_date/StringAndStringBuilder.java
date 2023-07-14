package ss8_stringbuilder_date;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        String str = "";

        for (int i = 1; i <= 10; i++) {
            str += i + " ";
        }

        System.out.println(str);



        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            stringBuilder.append(i + " ");
        }

        System.out.println(stringBuilder);


        // String là immutable
        String str1 = "";
        String str2 = str1;
        str1 = "Hello";
        System.out.println(str1 == str2); //false


        // StringBuilder là mutable
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = s1;
        s1.append("Hello");
        System.out.println(s1 == s2); // true



        // Bài tập: Đảo ngược chuỗi
        // String không có phương thức reverse
        // StringBuilder có phương thức reverse
        String name = "Nguyễn Văn A";
        StringBuilder stringBuilder1 = new StringBuilder(name);
        name = stringBuilder1.reverse().toString();
        System.out.println("Name: " + name);
    }
}
