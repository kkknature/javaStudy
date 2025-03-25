class Variable {
    String instanceVariable = "홍길동";
    static String classVariable = "박문수";

    // 인스턴스 메서드
    void doFunc1() {
        System.out.println("doFunc1() 호출");

        System.out.println(this.instanceVariable);

        //System.out.println(this.classVariable);
        System.out.println(Variable.classVariable);
    }

    // 클래스(정적) 매서드
    static void doFunc2() {
        System.out.println("doFunc2() 호출");

        // 인스턴스 멤버필드 사용 불가
        //System.out.println(this.instanceVariable);
        
        //System.out.println(this.classVariable);
        System.out.println(Variable.classVariable);
    }
}

public class VariableEx03 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.doFunc1();
        v.doFunc2();

        Variable.doFunc2();
    }
}

// java 클래스명
// jvm 클래스명.main()
