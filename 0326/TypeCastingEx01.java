// 형변환 첫 예시
class Parent {
    Parent() {
        System.out.println("Parent 실행");
    }
}

class Child1 {
    Child1() {
        System.out.println("Child1 실행");
    }
}

class Child2 extends Parent {
    Child2() {
        System.out.println("Child2 실행");
    }
}

public class TypeCastingEx01 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        Parent p = new Parent();

        // 자식 -> 부모 : 자동형변환
        p = c2;
        //p = c1;

        Parent p2 = c2;
        Parent p3 = new Child2();
    }
}
