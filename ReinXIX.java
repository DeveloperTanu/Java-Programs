class Dog {
    void sound() {
        System.err.println("Bark");
    }
}

class Cat {
    void sound() {
        System.err.println("meow");
    }
}

public class ReinXIX {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();
    }
}