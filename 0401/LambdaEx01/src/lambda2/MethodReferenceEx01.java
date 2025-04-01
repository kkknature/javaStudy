package lambda2;

public class MethodReferenceEx01 {
    public static void main(String[] args) {

        Person p = new Person();

        // 다형성
        // API 사용
        p.action( Math :: max);
        p.action( Math :: min);

        // 커스텀클래스
        p.action((x, y) -> Computer.staticCalc(x, y));
        p.action( Computer::staticCalc );

        Computer computer = new Computer();
        p.action((x, y) -> computer.instanceCalc(x, y));
        p.action( computer::instanceCalc );
    }
}
