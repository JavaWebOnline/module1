package ss9_array;

import java.util.Arrays;

public class PassVariableToMethod {
    public static void main(String[] args) {
//        int a = 2;
////        changeData(a);
//        int n = a;
//        n = 100;
//        System.out.println("a = " + a);


        int[] a = {10, 20, 30};
        changeData(a);
        System.out.println(Arrays.toString(a));
    }

    public static void changeData(int[] arr) {
        arr[0] = 99;
        arr = new int[3];
        arr[0] = 100;
    }

    public static void changeData(int n) {
        n = 100;
    }
}
