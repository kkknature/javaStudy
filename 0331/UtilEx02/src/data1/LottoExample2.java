package data1;

import java.util.ArrayList;
import java.util.HashSet;

public class LottoExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            HashSet<String> lottos = new HashSet<>();

            while(lottos.size() < 6) {
                lottos.add((int)( Math.random() * 45 ) + 1 + "");
            }

            System.out.println(i + "회 " +lottos);

        }
    }
}
