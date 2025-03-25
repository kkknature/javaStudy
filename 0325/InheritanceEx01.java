class Parent {
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child1 {
    void viewChild1() {
        System.out.println("viewChild1() 호출");
    }
}

class Child2 extends Parent {
    void viewChild2() {
        System.out.println("viewChild2() 호출");
    }

}

public class InheritanceEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c1 = new Child1();

        p.viewParent();
        c1.viewChild1();

        Child2 c2 = new Child2();
        c2.viewChild2();
        //
        c2.viewParent();
    }
}
