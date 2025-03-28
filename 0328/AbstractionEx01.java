// 추상 클래스 선언

// 실체 클래스
class Parent1 {
    Parent1() {
        System.out.println("Parent1 호출");
    }
}

// abstract - 추상클래스
// 생성할 수 없음
abstract class Parent2 {
    Parent2() {
        System.out.println("Parent2 호출");
    }

    void viewData1() {
        System.out.println("viewData1 호출");
    }

    // 추상메소드 - 정의 안된 메소드
    // 오버라이딩을 전제로
    abstract void viewData2();
}

abstract class Child2 extends Parent2 {
    Child2() {
        System.out.println("Child2 호출");
    }

    //void viewData2() {
    //    System.out.println("viewData2 호출");
    //};
}


public class AbstractionEx01 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        //Parent2 p2 = new Parent2();
        Child2 c2 = new Child2();
        c2.viewData1();
    }
}
