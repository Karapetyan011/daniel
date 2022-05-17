package hashCode;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surName;
    private final int age;
    private final double height;
    private final double weight;
    private final String hairColor;
    private final String eyeColor;

    public Person(String name, String surName, int age, double height, double weight, String hairColor, String eyeColor) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }


    public static void main(String[] args) {
        Person jack = new Person("JACK", "Daniels", 33, 188.8, 98.9, "Black", "Brown");
        Person rose = new Person("JACK", "Daniels", 33, 188.9, 98.9, "Black", "Brown");

        System.out.println(jack.hashCode());
        System.out.println(rose.hashCode());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(surName, person.surName) && Objects.equals(hairColor, person.hairColor) && Objects.equals(eyeColor, person.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, height, weight, hairColor, eyeColor);
    }
}
