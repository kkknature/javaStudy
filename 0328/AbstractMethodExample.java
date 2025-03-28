abstract class Animal {

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("야옹");
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
