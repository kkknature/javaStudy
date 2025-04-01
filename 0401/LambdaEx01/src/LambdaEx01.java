public class LambdaEx01 {
    public static void main(String[] args) {

        // 인터페이스 구현하는 방법

        // 1. 클래스 implements 인터페이스
        // 2. 익명 내부클래스

        LambdaInter f1 = new LambdaInter() {
            @Override
            public void method() {
                System.out.println("method() 호출");
            }

            //public void method2() {
            //    System.out.println("method2() 호출");
            //}
        };

        f1.method();
        //f1.method2();

        // 람다식으로 변경 가능
        // 함수형 인터페이스 - 메서드가 반드시 1개여야 함
        LambdaInter f2 = () -> {
            System.out.println("method() 호출");
        };

        f2.method();
    }
}
