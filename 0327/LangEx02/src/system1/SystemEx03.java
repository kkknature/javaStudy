package system1;

public class SystemEx03 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int sum = 0;

        for (int i = 1; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("결과: " + sum);

        long endTime = System.currentTimeMillis();

        System.out.println("실행 시간: " + (endTime - startTime));
    }
}
