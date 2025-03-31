package list1;

import java.util.ArrayList;

public class ArrayListEx05 {
    public static void main(String[] args) {

        Student s1 = new Student("1001", "홍길동");
        Student s2 = new Student("1002", "임꺽정");
        Student s3 = new Student("1003", "이몽룡");

        ArrayList<Student> list1 = new ArrayList<Student>();
        ArrayList<Student> list2 = new ArrayList<>();

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            Student s = list1.get(i);
            System.out.println(s.getHakbun());
            System.out.println(s.getName());
        }
    }
}
