public class LoopEx03 {
    public static void main(String[] args) {
        System.out.println("시작");

        /* 
        for(int i = 1; i <= 10; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
        */

        for(int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("끝");
    }
}
