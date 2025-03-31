package data1;

import java.util.HashSet;

public class LottoEx02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            HashSet<String> lottos = new HashSet<>();

            while (true) {

                lottos.add( (int) (Math.random() * 45) + 1 + "");

                if(lottos.size() == 6) {
                    break;
                }
            }

            System.out.println(lottos);
        }
    }
}
