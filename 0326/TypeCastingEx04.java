// Object 클래스 (모든 클래스의 조상)
class Parent /*extends Object (생략된거) */ {
    Parent() {
        System.out.println("Parent 호출");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child 호출");
    }

}

public class TypeCastingEx04 {
    public static void main(String[] args) {
        //Parent p1 = new Child();

        Object o1 = new Parent();
        Object o2 = new Child();

        // 강제 형변환
        Child c1 = new Child();
        Object o3 = c1;
        c1 = (Child)o3;
    }
}
