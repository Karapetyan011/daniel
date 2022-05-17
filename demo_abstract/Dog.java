package demo_abstract;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Haf Gaf");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();



        dog.makeSound();
    }
}

