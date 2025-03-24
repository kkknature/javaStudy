public class VariableEX01 {
    public static void main(String[] args) {
        // 프로그램 시작

        // 변수 선언
        // 자료형 변수명;
        int intNum1;

        // 변수의 초기화
        intNum1 = 10;

        // 변수 내용의 출력
        System.out.println( intNum1 );

        // 선언과 동시에 초기화
        int intNum2 = 20;
        System.out.println( intNum2 );

        // 변수의 재선언 : 불가능
        //int intNum1;

        // 변수값의 재할당 : 덮어쓰기
        intNum1 = 100;
        System.out.println( intNum1 );

        // 프로그램 끝
    }
}
