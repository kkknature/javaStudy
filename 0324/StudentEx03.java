class Student {
    // 멤버필드(변수)
    String hakbun;
	String name;

    void doStudy() {
        System.out.println("공부하기");
        // 자기참조
        System.out.println(this);
        System.out.println(this.hakbun);
        System.out.println(this.name);

    }

}

public class StudentEx03 {
    public static void main(String[] args) {
        
        Student stu1 = new Student();
        System.out.println("stu1: " + stu1);
        stu1.hakbun = "1001";
        stu1.name = "홍길동";
        stu1.doStudy();

        Student stu2 = new Student();
        System.out.println("stu2: " + stu2);
        stu2.hakbun = "1002";
        stu2.name = "박문수";
        stu2.doStudy();

    }
}
