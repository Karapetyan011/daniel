package hashCode;

import java.util.Objects;

public class Human  extends  Object{
    private final String name;
    private final String surName;
    private final int age;

    public Human(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public static void main(String[] args) {
        Human hrant = new Human("Hrant", "Karapetyan", 30);
        Human hrant1 = new Human("Hrant", "Karapetyan", 30);
        Human hrant2 = new Human("Hrant", "Karapetyan", 29);
        Human hrant3 = new Human("Hrant", "Karapetyan", 20);
        System.out.println(hrant.equals(hrant1));
        System.out.println(hrant.equals(hrant2));


        Integer x = 8;
        Integer y = 8;
        System.out.println(x == y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (!this.getClass().equals(obj.getClass())) {
            return false;
        } else
            return this.name.equals(((Human) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }
}
