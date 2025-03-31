package set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
    public static void main(String[] args) {

        // 생성
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>(100);

        Set<String> set1 = new HashSet<>();

        hs1.add("홍길동");
        hs1.add("임꺽정");
        hs1.add("장길산");

        System.out.println(hs1.size());
        System.out.println(hs1);

        hs1.add("홍길동");
        hs1.add("홍길동");
        hs1.add("이몽룡");
        hs1.add("이몽룡");

        System.out.println(hs1.size());
        System.out.println(hs1);

        //System.out.println(hs1.get());
        // 일반 for문은 사용 불가 (index번호가 없어서)

        // 새로운 버전
        for(String data : hs1) {
            System.out.println(data);
        }

        // Iterator - 반복자 (옛날버전)
        Iterator<String> i = hs1.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
