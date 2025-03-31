package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx01 {
    public static void main(String[] args) {

        // key : String
        // value : String
        // 생성
        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>(100);

        Map<String, String> map = new HashMap<>();

        // 데이터 넣기
        hm1.put("a", "홍길동");
        hm1.put("b", "임꺽정");
        hm1.put("c", "장길산");

        System.out.println(hm1);
        System.out.println(hm1.size());

        hm1.put("d", "이몽룡");

        System.out.println(hm1);

        // 수정 (key가 같으면)
        hm1.put("b", "조자룡");

        System.out.println(hm1);

        System.out.println(hm1.get("a"));
        System.out.println(hm1.get("b"));

        // 제거
        System.out.println(hm1.remove("a"));
        System.out.println(hm1);

        hm1.clear();
        System.out.println(hm1);
    }
}
