package data1;

import java.util.ArrayList;

public class DataEx03 {
    public static void main(String[] args) {

        Person p1 = new Person("1", "홍길동", "010-111-1111", 20, "서울시");
        Person p2 = new Person("2", "임꺽정", "010-222-2222", 22, "경기도");
        Person p3 = new Person("3", "장길산", "010-333-3333", 25, "강원도");

        ArrayList<Person> datas = new ArrayList<Person>();
        datas.add(p1);
        datas.add(p2);
        datas.add(p3);

        for (Person data : datas) {
            System.out.println(data.getSeq());
            System.out.println(data.getName());
            System.out.println(data.getPhone());
            System.out.println(data.getAge());
            System.out.println(data.getRegion());
        }
    }
}
