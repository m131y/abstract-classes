abstract class Animal {
    abstract void makeSound();

    public void sleep(){
        System.out.println("zzz");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}