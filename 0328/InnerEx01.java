class Outer {
    // 멤버필드
    private int x1 = 100;
    public int x2 = 100;

    // 내부 클래스
    class Inner {
        private int y1 = 200;
        public int y2 = 2000;

        public void viewInner() {
            System.out.println("viewInner 호출");

            System.out.println(x1);
            System.out.println(x2);
            System.out.println(y1);
            System.out.println(y2);
        }
    }
}

public class InnerEx01 {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        //System.out.println(outer.x1);
        System.out.println(outer.x2);

        // 내부클래스를 인스턴스화
        Outer.Inner inner = outer.new Inner();
        //System.out.println(inner.y1);
        System.out.println(inner.y2);

        inner.viewInner();
    }
}
