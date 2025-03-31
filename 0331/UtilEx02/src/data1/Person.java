package data1;

public class Person {

    private String seq;
    private String name;
    private String phone;
    private int age;
    private String region;

    public Person(String seq, String name, String phone, int age, String region) {
        this.seq = seq;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.region = region;
    }

    public String getSeq() {
        return seq;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getRegion() {
        return region;
    }
}
