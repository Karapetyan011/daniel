// Stexceci Person class aysinqn Person tip
public class Person {

    // Personi hamar avelacreci HATKUTYUNNER, voronq karox en
    // nkaragrel Personin
    String name;
    String surname;
    String gender;
    int age;
    double weight;
    double height;

    // Stexcum enq function-ner Person-i hamar


    // Utel - Ays function-@ @ndunum e String parameter, aysinqn function-@ kancheluc
    //        piti voreve String poxancenq iran, u inq@ ayd mer poxancac@ ktpi,
    //        qani vor function-i mej grel enq System.out.println() function-@ u
    //        ira mej el texadrel enq ayn String parameter-@ vor@ piti stana eat() function-@

    void eat(String eatThing) {
        System.out.println("I eat " + eatThing);
    }

    // Xmel- Ays function-@ @ndunum e String parameter, aysinqn function-@ kancheluc
    //       piti voreve String poxancenq iran, u inq@ ayd mer poxancac@ ktpi,
    //       qani vor function-i mej grel enq System.out.println() function-@ u
    //       ira mej el texadrel enq ayn String parameter-@ vor@ piti stana eat() function-@

    void drink(String drinkThing) {
        System.out.println("I drink " + drinkThing);
    }

    // Qnel- Ays function-@ chi @ndunum vochmi parameter, menq uxxaki
    //       function-i mej grel enq System.out.println() function-@ u
    //       inq@  petq e tpi inch vor grel enq ira mej: Ays depqum petq e tpi "I  Sleep"

    void sleep() {
        System.out.println("I Sleep");
    }

    //   Haytararum enq main() function-@, qani vor gitenq, vor kod@ ashxatacnelu hamar
    //   petq e kanchvi main() function-@

    public static void main(String[] args) {

        // Stexcum enq Person-i object-@
        Person personBob = new Person();

        // Mer object-in talis enq hatkutyunner@
        personBob.name = "Bob";
        personBob.surname = "McGregor";
        personBob.gender = "male";
        personBob.age = 46;
        personBob.weight = 88.5;
        personBob.height = 178.5;


        // Tpum enq mer object-i hatkutyunner@
        System.out.println(personBob.name);
        System.out.println(personBob.surname);
        System.out.println(personBob.gender);
        System.out.println(personBob.age);
        System.out.println(personBob.weight + " kg");
        System.out.println(personBob.height + " sm");

        System.out.println();

        // Kanchum enq mer object-i function-ner@
        personBob.sleep();

        personBob.eat("Meat");

        personBob.drink("Coca-Cola");
    }

}
