class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }

}

class Cat extends Animal {

    void sound() {
        System.out.println("Meow");
    }

}

public class ReinXX {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

    }
}