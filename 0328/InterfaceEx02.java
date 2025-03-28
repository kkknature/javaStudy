interface InterA {
    void methodA();
}

interface InterB {
    void methodB();
}

class ClassC {
    void methodC() {
        System.out.println("methodC 호출");
    }
}

class ClassA extends ClassC implements InterA, InterB {
    public void methodA() {
        System.out.println("methodA 실행");
    }

    public void methodB() {
        System.out.println("methodB 실행");
    }

}


public class InterfaceEx02 {
    public static void main(String[] args) {
        
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
        a.methodC();
    }
}
