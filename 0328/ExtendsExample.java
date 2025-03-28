interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

class InterfaceCImp1 implements InterfaceC {

    public void methodA() {
        System.out.println("InterfaceCImp1-methodA 실행");
    }
    public void methodB() {
        System.out.println("InterfaceCImp1-methodB 실행");
    }
    public void methodC() {
        System.out.println("InterfaceCImp1-methodC 실행");
    }
}

public class ExtendsExample {
    public static void main(String[] args) {
        
        InterfaceCImp1 imp1 = new InterfaceCImp1();

        InterfaceA ia = imp1;
        ia.methodA();
        //ia.methodB();
        System.out.println();

        InterfaceB ib = imp1;
        //ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = imp1;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
