package lambda2;

public class MethodReferenceExample {
    public static void main(String[] args) {

        Person2 person = new Person2();
        person.ordering(String :: compareToIgnoreCase);
    }
}
