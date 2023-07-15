package ss12_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        // add(Object o): Thêm phần tử o vào cuối.
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(30);
        integers.add(30);
        integers.add(30);
        integers.add(30);

//        // add(int index, Object element): Thêm phần tử vào vị trí index
//        integers.add(1, 100);
//
//        // set(int index, Object element): Thay thế phần tử tại vị trí index
//        integers.set(1, 200); // [10, 200, 20, 30]
//
//        // get(int index): Trả về phần tử tại index
//        System.out.println(integers.get(2));
//
//        // indexOf(Object o):  Lấy vị trí index phần tử đầu tiên tìm thấy
//        System.out.println(integers.indexOf(30));
//
//        // lastIndexOf(Object o): Lấy vị trí index phần tử cuối cùng tìm thấy
//        System.out.println(integers.lastIndexOf(30));
//
//        // remove(int index): Xóa phần tử lại vị trí index
//        integers.remove(2);
        // remove(Object o): Xóa phần tử o đầu tiên

        // removeAll(Collection c): Xóa toàn bộ phần tử c

//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(30);
        integers.removeAll(Arrays.asList(30));

        System.out.println(integers);
    }
}
