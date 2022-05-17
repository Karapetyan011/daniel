import java.util.Objects;

public class Animal {
    String name;
    String surname;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(surname, animal.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.name="Bob";

        animal2.name = "jack";

        animal1.age = 12;
        animal2.age = 12;

        int x =7;

        System.out.println(animal1.toString());
        System.out.println(animal1.name.equals(animal2.name));
    }

    void eat() {
        System.out.println("I eat");
    }

    void drink() {
        System.out.println("I drink");
    }
}


class Cat extends Animal {

    double weight;

    @Override
    void eat() {
        System.out.println("Cat is eat");
    }

    @Override
    void drink() {
        System.out.println("Cat is drink");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.age = 12;
        tom.name = "tom";
        tom.weight = 5;
        tom.drink();
        tom.eat();
    }
}

class Kitty extends Cat {

    String owner;

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        kitty.owner = "Jack";
        System.out.println(kitty.owner);   // JAck
        System.out.println(kitty.weight);  // 0.0
        System.out.println(kitty.name);    // null
        System.out.println(kitty.age);     // 0
        Animal animal = new Animal();
    }
}


class Dddd{
    public static void main(String[] args) {
        double x = 5.0;
        double y = 3.0;

        double a = 7.0;
        double b = 5.0;

        double xy = x/y;
        double ab = a/b;

        System.out.println(xy);
        System.out.println(ab);
    }
}
