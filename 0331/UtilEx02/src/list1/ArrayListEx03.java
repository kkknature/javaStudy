package list1;

import java.util.ArrayList;

public class ArrayListEx03 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        // 10 - 기본자료형
        // 10 -> Integer(Autoboxing) -> Object
        // add(Object)
        al.add(10);
        al.add(20);

        System.out.println(al);

        Integer i1 = (Integer)al.get(0);
        System.out.println(i1.intValue());

        // unboxing
        int i2 = (Integer)al.get(1);
        System.out.println(i2);
    }
}
