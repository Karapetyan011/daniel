package static_keyword;

public class DemoStaticKeyword {
    public static String surname;

    public final String name;
    public int tmp;
    public int age;

    public DemoStaticKeyword(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        DemoStaticKeyword box = new DemoStaticKeyword("Bob");
        box.age = 77;
        box.tmp = 3;

        DemoStaticKeyword.surname = "Jack";
    }
}

class CustomColors {
    private static final String BASE_URL = "https://facebook.com";
    static int tmp = 4;
    int x = 4;
    int z = 4;

    public static void main(String[] args) {
        CustomColors customColors = new CustomColors();

    }
}