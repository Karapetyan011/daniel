package toString;

import java.io.Serial;
import java.io.Serializable;

public class User extends Object implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String firstName;

    private String lastName;
    private String email;
    private String login;
    private int password;

    public User() {
    }

    public User(String firstName, String lastName, String email, String login, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.password = password;
    }


    public static void main(String[] args) {
        User man1 = new User("Bob", "McGregor", "dhf@.ru", "bobMan1977.", 1977);
        User man2 = new User("Bob", "Adams", "dhf@.ru", "bobMan1977.", 1977);
        System.out.println(man1);
        System.out.println(man2);
//        System.out.println( man1.equals(man2));
        System.out.println(man1 == man2);
        System.out.println(man1.firstName.equals(man2.firstName));

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}