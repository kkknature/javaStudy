package set1;

import java.util.HashSet;

public class HashSetEx02 {
    public static void main(String[] args) {

        Member m1 = new Member("홍길동", 30);
        Member m2 = new Member("임꺽정", 32);
        Member m3 = new Member("장길산", 36);

        HashSet<Member> hs = new HashSet<Member>();
        hs.add(m1);
        hs.add(m2);
        hs.add(m3);

        System.out.println(hs);     // 데이터를 넣은 순서대로 출력되지 않음

        Member m4 = new Member("이몽룡", 35);

        hs.add(m4);
        // 추가 안됨 (참조값이 같음)
        hs.add(m1);
        hs.add(m1);

        // 추가 (참조값이 다름 -> 데이터 내용 같아도 참조 다르면 추가됨)
        Member m5 = new Member("홍길동", 30);

        hs.add(m5);

        System.out.println(hs);

    }
}
