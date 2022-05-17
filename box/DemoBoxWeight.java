package box;

public class DemoBoxWeight{

    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15, 24.4);
        BoxWeight myBox2 = new BoxWeight(5,10,6, 2.42);
        double volume;

        volume = myBox1.volume();
        System.out.println("myBox1-ի ծավալն է " + volume);
        System.out.println("myBox1-ի քաշն է " + myBox1.weight);
        System.out.println();

        volume = myBox2.volume();
        System.out.println("myBox2-ի ծավալն է " + volume);
        System.out.println("myBox2-ի քաշն է " + myBox2.weight);
    }

}
