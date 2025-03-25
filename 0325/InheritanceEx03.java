// 부모, 자식, 손자
// 상속은 계속 누적된다

class Parent {
    String p = "부모";

    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child extends Parent {
    String c = "자식";

    void viewChild() {
        System.out.println("viewChild() 호출");
    }
}

class GrandChild extends Child {
    String gc = "손자";

    void viewGrandChild() {
        System.out.println("viewGrandChild() 호출");
    }
}

public class InheritanceEx03 {
    public static void main(String[] args) {
        
        GrandChild gc = new GrandChild();
        gc.viewGrandChild();
        gc.viewChild();
        gc.viewParent();

        System.out.println(gc.gc);
        System.out.println(gc.c);
        System.out.println(gc.p);
    }
}
