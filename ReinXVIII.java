class Animal {
    String name;

    void thisWillDisplay() {
        System.out.println("This " + name + " eats food.");
    }
}

class Lion extends Animal {
}

class Dog extends Animal {
    void sound() {
        System.out.println(name + " barks");
    }
}

public class ReinXVIII {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.name = "sher";

        l1.thisWillDisplay();

        Dog d1 = new Dog();
        d1.name = "Doggy";

        d1.thisWillDisplay();
        d1.sound();
    }
}