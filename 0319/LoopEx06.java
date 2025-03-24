public class LoopEx06 {
    public static void main(String[] args) {
        System.out.println("시작");

        int sum = 0;

        /* 
        for(int i = 1; i <= 10; i++) {
            //System.out.println(i);

            // 누적
            sum = sum + i;
            //System.out.println(sum);
        }
        */

        /* 
        for(int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        */

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        System.out.println("끝");
    }
}
