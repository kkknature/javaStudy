package list1;

public class Student {
    private String hakbun;
    private String name;

    // constructor
    // getter
    // toString

    public Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hakbun='" + hakbun + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
