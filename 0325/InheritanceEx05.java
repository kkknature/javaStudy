class Parent {
    //Parent() {
    //    System.out.println("Parent() 호출" + this);
    //}

    Parent(int a) {
        System.out.println("Parent(int a) 호출" + this);
    }

}

class Child extends Parent {
    Child() {
        super(10);
        System.out.println("Child() 호출" + this);
    }
}

public class InheritanceEx05 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c: " + c);
    }
}
