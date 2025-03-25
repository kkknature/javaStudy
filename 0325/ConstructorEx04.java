class Student1 {
    String hakbun;
    String name;

    Student1() {
        //this.hakbun = "0000";
        //this.name = "아무개";

        this("0000", "아무개");
    }

    Student1(String name) {
        //this.hakbun = "0000";
        //this.name = name;

        this("0000", name);
    }

    Student1(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }
}

public class ConstructorEx04 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.hakbun+ " / " + s1.name);

        Student1 s2 = new Student1("1003", "박문수");
        System.out.println(s2.hakbun+ " / " + s2.name);

    }
}
