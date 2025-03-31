package data1;

import java.util.ArrayList;

public class LottoExample {
    public static void main(String[] args) {

        Lotto lotto1 = new Lotto("1회"
                , (int) ( Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1);

        Lotto lotto2 = new Lotto("2회"
                , (int) ( Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1);

        Lotto lotto3 = new Lotto("3회"
                , (int) ( Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1);

        Lotto lotto4 = new Lotto("4회"
                , (int) ( Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1);

        Lotto lotto5 = new Lotto("5회"
                , (int) ( Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int) (Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1
                , (int)( Math.random() * 46) + 1);

        ArrayList<Lotto> lottos = new ArrayList<Lotto>();

        lottos.add(lotto1);
        lottos.add(lotto2);
        lottos.add(lotto3);
        lottos.add(lotto4);
        lottos.add(lotto5);

        for (Lotto lotto : lottos) {
            System.out.print(lotto.getCountNum() + "\t");
            System.out.print(lotto.getNum1() + "\t");
            System.out.print(lotto.getNum2() + "\t");
            System.out.print(lotto.getNum3() + "\t");
            System.out.print(lotto.getNum4() + "\t");
            System.out.print(lotto.getNum5() + "\t");
            System.out.print(lotto.getNum6() + "\t");
            System.out.println();
        }
    }
}
