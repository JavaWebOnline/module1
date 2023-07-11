package ss3_java_overview.practice;

public class DeclareVariable {
    public static void main(String[] args) {
        byte b = 127;
        //[-128:127]
        // 1byte = 8bit => 2^8 = 256
        short s = Short.MAX_VALUE;

        int i = 2000000;
        long l = 20000000000000L; // 20000000000000L => kiểu long

        // Số nguyên: int
        // Số thực: double
        double d = 2.0d; //2.0 hoặc 2.0d => double
        float f = 2.0f; //2.0f hoặc 2.0F: float

        System.out.println( 19/(double)10);
    }
}
