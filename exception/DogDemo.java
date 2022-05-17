package exception;

import java.io.FileNotFoundException;

public class DogDemo {
//    public static void main(String[] args) {
//
//        Dog dog = new Dog("Baron");
//        dog.putCollar();
////        dog.putMuzzle();
//        dog.putLeash();
////        dog.walk();//Unhandled exception: DogIsNotReadyException
//        try {
//            dog.walk();
//        }catch (Exception e){
//
//
//        }
//    }

    public static void main(String[] args) {

        Dog dog = new Dog("Baron");
        dog.putCollar();
//        dog.putMuzzle();
        dog.putLeash();
        try {
            dog.walk();
        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
            System.out.println("Checking out the gear!\n Collar on? " + dog.isCollarPutOn + "\n Leash put on? "
                    + dog.isLeashPutOn + "\n Muzzle on? " + dog.isMuzzlePutOn);
        }
    }
}
