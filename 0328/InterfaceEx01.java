// 부모
interface InterA {
    // 상수
    // 추상 메소드 선언
    public abstract void methodA();
    
    // 전부 같아서 아래처럼도 쓸 수 있음
    void methodB();

}

// 자식
class ClassA implements InterA {
    // 선언한 추상 메소드 구현
    public void methodA() {
        System.out.println("methodA 실행");
    }

    public void methodB() {
        System.out.println("methodB 실행");
    }
}

abstract class ClassB implements InterA {
    public void methodA() {
        System.out.println("methodA 실행");
    }

    // methodB 없으면 불완전 -> abstract 만들고 손자 클래스에서 구현

}

class ClassC extends ClassB {
    public void methodB() {
        System.out.println("methodB 실행");
    }
}

public class InterfaceEx01 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();

        //ClassB b = new ClassB();
        ClassC c = new ClassC();
        c.methodA();
        c.methodB();

        // 형변환
        InterA ia = new ClassA();
        ia.methodA();
        ia.methodB();
    }
}
