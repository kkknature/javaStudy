package list1;

import java.util.ArrayList;

public class ArrayListEx02 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("홍길동");
        al.add("박문수");
        al.add("임꺽정");

        System.out.println(al);

        // 데이터 조작
        // 데이터 중간에 추가 (add는 기본적으로 마지막에 추가)
        al.add(2, "장길산");
        System.out.println(al);

        // 데이터 수정
        al.set(0, "이몽룡");
        System.out.println(al);

        // 특정 데이터 삭제
        al.remove(0);
        System.out.println(al);

        // 전체 데이터 삭제
        al.clear();
        System.out.println(al);
    }
}
