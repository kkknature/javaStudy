class Method {
    // 단순 메서드 선언
    void doFunc1() {
        System.out.println("doFunc1 호출");
    }

    // 매개변수(파라메터)가 있는 메서드 선언 .. 이론상 파라메터는 255개까지
    void doFunc2(int data1) {
        // int data1;
        System.out.println("doFunc2 호출 : " + data1);
    }

    void doFunc3(int data1, int data2) {
        System.out.println("doFunc3 호출 : " + data1);
        System.out.println("doFunc3 호출 : " + data2);
    }

    // void - 리턴이 없음을 뜻하는 예약어
    int doFunc4(int data1, int data2) {
        int sum = data1 + data2;
        return sum;
    }
}

public class MethodEx01 {
    public static void main(String[] args) {
        
        // 호출 (선언은 한 번만 가능, 호출은 여러번 가능)
        Method m = new Method();
        m.doFunc1();
        //m.doFunc1();
        //m.doFunc1();

        //m.doFunc2();
        m.doFunc2(10);

        m.doFunc3(10, 20);

        int result = m.doFunc4(10, 20);
        System.out.println(result);
    }
}
