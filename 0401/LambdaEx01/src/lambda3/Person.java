package lambda3;

public class Person {

    public Member getMember1(Createtable1 createtable) {
        String id = "winter";
        Member member = createtable.create(id);
        return member;
    }

    public Member getMember2(Createtable2 createtable) {
        String id = "winter";
        String name = "한겨울";
        Member member = createtable.create(id, name);
        return member;
    }
}
