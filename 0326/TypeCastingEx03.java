// 부모 -> 자식 : 강제 형변환환
class Parent {
    Parent() {
        System.out.println("Parent 호출");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child 호출");
    }
}

public class TypeCastingEx03 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        //c = p;

        // 컴파일 시에 에러 발생하지 않으나 실행 시 에러발생
        //c = (Child)p;

        // 강제형변환의 조건
        // 자식 -> 부모 -> 자식
        p = c;
        c = (Child)p;
    }
}
