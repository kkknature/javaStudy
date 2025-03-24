class Util {
    
    void doGugudan(int dan) {
        for(int i = 1; i <= 9; i++) {
            //System.out.println(dan + " x " + i + " = " + (dan * i));
            System.out.printf("%s x %s = %s\n", dan, i, (dan * i));
        }
    }

    void doGugudan2(int start, int end) {

        if(start >= end) {
            // 비정상 처리
            System.out.println("시작 단수가 큽니다.");
        } else {
            // 정상 처리
            for(int i = start; i <= end; i++) {
                for(int j = 1; j <= 9; j++) {
                    //System.out.printf("%s x %s = %s\t", i, j, (i * j));

                    System.out.printf("%2s x %2s = %3s\t", i, j, (i * j));
                }

                System.out.println();
            }
        }
    }

    int viewMaxNumber(int value1, int value2, int value3) {
        int value = 0;
       
        // 큰 수를 찾는 알고리즘
        if(value1 >= value2 && value1 >= value3) {
            value = value1;
        } else if(value2 >= value1 && value2 >= value3) {
            value = value2;
        } else if(value3 >= value1 && value3 >= value2) {
            value = value3;
        }

        return value;
    }
}

public class UtilEx01 {
    public static void main(String[] args) {
        
        Util u = new Util();

        u.doGugudan(5);

        u.doGugudan2(2, 1);
        u.doGugudan2(1, 3);

        System.out.println("큰 수: " + u.viewMaxNumber(4, 6, 3));
        System.out.println("큰 수: " + u.viewMaxNumber(6, 3, 7));
    }
}
