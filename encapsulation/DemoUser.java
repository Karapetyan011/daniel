package encapsulation;

 public class DemoUser {

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.getName());
        user1.setName("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(user1.getName());
    }
}
