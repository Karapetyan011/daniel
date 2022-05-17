package inheritance_a_super_b_sub.a_super_b_sub;

import box.MyInterface;
import box.YourInterface;

class Person2 {
    String name;
    String surname;

    void setNameSurname(String x, String y) {
        System.out.println("hello");
    }
}

class C extends Person2 implements MyInterface, YourInterface {

    @Override
    void setNameSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class M {
    public static void main(String[] args) {

        Person2 jack = new Person2();
        jack.setNameSurname("JAck", "Daniels");

        System.out.println(jack.name);
        System.out.println(jack.surname);

        System.out.println("---------------------");
        C jack1 = new C();
        jack1.setNameSurname("Jack", "Daniels");
        System.out.println(jack1.name);
        System.out.println(jack1.surname);
    }
}