package box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box otherBox = new Box();
        double volume;

        volume = weightBox.volume();
        System.out.println("weightBox-ի ծավալն է " + volume);
        System.out.println("weightBox-ի քաշն է " + weightBox.weight);
        System.out.println();

        otherBox = weightBox;    // վերագրել weightBox օբյեկտի հղումը otherBox օբյեկտի հղումին
        volume = otherBox.volume();
        System.out.println("otherBox-ի ծավալն է " + volume);
//        System.out.println("otherBox-ի քաշն է " + otherBox.weight); // Հետևյալ հայտարարությունն անվավեր է,
        // քանի որ otherBox Օբյեկտը չունի  քաշի(weight) անդամ:


    }


}
