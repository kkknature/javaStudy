package data1;

import java.util.ArrayList;

public class LottoEx01 {
    public static void main(String[] args) {

        // 한 줄 데이터의 내부 중복을 제거해서 출력

        for (int i = 1; i <= 5; i++) {

            ArrayList<String> lottos = new ArrayList<>();

            lottos.add(i + "회");

            for(int j = 1; j <= 6; j++) {
                lottos.add( (int)(Math.random() * 45) + 1 + "");
            }

            System.out.println(lottos);

            lottos.clear();
        }
    }
}
