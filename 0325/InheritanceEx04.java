// 메소드 재정의(오버라이딩)

class Parent {
    void viewParent() {
        System.out.println("parent viewParent 호출");
    }
}

class Child extends Parent {
    void viewChild() {
        System.out.println("viewChild 호출");
    }

    // 메서드 오버라이딩(재정의)
    // 부모 메소드의 선언부와 동일하지 않기 때문에 호출 안됨.
    void viewParent() {
        System.out.println("Child viewParent 호출");  

        // 부모의 메서드, 멤버필드
        super.viewParent();
    }

}

public class InheritanceEx04 {
    public static void main(String[] args) {
        
        Child c = new Child();
        c.viewChild();
        c.viewParent();
    }
}
