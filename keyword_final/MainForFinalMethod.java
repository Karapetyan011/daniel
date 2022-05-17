package keyword_final;

public class MainForFinalMethod extends DemoJavaFinalMethod{
    // try to override final method

//    public final void display() {
//        System.out.println("The final method is overridden.");
//    }

    public static void main(String[] args) {
        MainForFinalMethod obj = new MainForFinalMethod();
        obj.display();
    }
}
