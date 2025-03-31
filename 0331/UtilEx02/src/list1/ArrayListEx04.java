package list1;

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("박문수");
        al.add("임꺽정");
        //al.add(10);
        //al.add(20);

        System.out.println(al);

        for(int i = 0; i < al.size(); i++) {
            String str = (String)al.get(i);
            System.out.println(str);
        }


        // 입력 데이터의 자료형 고정
        // => 제네릭(generic)
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("홍길동");
        al1.add("임꺽정");
        //al1.add(10);

        for(int i = 0; i < al1.size(); i++) {
            String str = al1.get(i);
            System.out.println(str);
        }

        for(String str : al1) {
            System.out.println(str);
        }
    }
}
