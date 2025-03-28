interface InterA {
    void methodA();
    
}

interface InterB extends InterA {
    void methodB();
}

class ClassA implements InterB {
    public void methodA() {
        System.out.println("methodA() 호출");
    }

    public void methodB() {
        System.out.println("methodB() 호출");
    }
}

public class InterfaceEx03 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}
