class Student {
    String hakbun;
    String name;
    int age;

    void learn() {
        System.out.println("learn 호출");
    }
    void eatLunch() {
        System.out.println("eatLunch 호출");

        // 메서드 호출
        // this를 쓰는게 더 좋은 방식
        this.learn();
        //learn();

        // 멤버필드 호출
        System.out.println("eatLunch 호출: " + this.hakbun);
    }
}

public class ThisEx01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.hakbun = "1001";

        stu.eatLunch();

    }
}
