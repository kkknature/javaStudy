package map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx02 {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("a", "홍길동");
        hm.put("b", "임꺽정");
        hm.put("c", "장길산");

        // 반복문을 통해서 데이터 가져오기
        // 키, 값

        // 키 목록
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            //System.out.println(key);
            System.out.println(hm.get(key));
        }

        Collection<String> values = hm.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
