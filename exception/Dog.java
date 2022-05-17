package exception;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }

    //Ошейник надет
    public void putCollar() {
//        System.out.println("Collar on!");
        this.isCollarPutOn = true;
    }

    //Поводок надет
    public void putLeash() {
//        System.out.println("Leash put on!");
        this.isLeashPutOn = true;
    }

    //Намордник надет
    public void putMuzzle() {
//        System.out.println("Muzzle on!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {

        System.out.println("We are going for a walk!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Hooray, let's go for a walk! " + name + " is very happy!");
        } else {
            throw new DogIsNotReadyException("Dog " + name + " not ready to go! Check your gear!");
        }
    }
}