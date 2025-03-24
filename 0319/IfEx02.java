public class IfEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        int number = 10;

        if(number % 2 == 0) {
            // 참일 때 실행할 문장 = 짝수
            System.out.println("짝수");
        } else {
            // 거짓일 때 실행할 문장 = 홀수
            System.out.println("홀수");
        }

        System.out.println("끝");
    }
}
