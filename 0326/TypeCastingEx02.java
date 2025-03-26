// 형변환 자식 -> 부모 특징
class Parent {
    Parent() {
        System.out.println("Parent 실행");
    }

    void viewParent() {
        System.out.println("viewParent 호출");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child2 실행");
    }

    void viewChild() {
        System.out.println("viewChild 호출");
    }

    // 오버라이딩
    void viewParent() {
        System.out.println("Child viewParent 호출");
    }

}

public class TypeCastingEx02 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.viewParent();
        c.viewChild();
        c.viewParent();

        // 형변환
        p = c;
        // * 오버라이딩 되어있는 경우에는 자식의 메서드 사용
        p.viewParent();
        // 자식 전용의 메서드는 사용할 수 없음
        //p.viewChild();

    }
}
