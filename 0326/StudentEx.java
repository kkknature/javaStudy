import com.naver.Student;

public class StudentEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.hakbun = "1001";
        s.name = "홍길동";
        s.age = 30;
        s.height = 180;
        
        System.out.println(s.hakbun);
        System.out.println(s.name);
    }
}
