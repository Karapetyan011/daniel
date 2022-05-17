package encapsulation;

public class User {
    private String name;
    private String surname;
    private String email;
    private int age;

//    public User(String name, String surname, String email, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.age = age;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>50 & !name.isEmpty()){
            System.out.println("hajox");
        }else{
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name + "," + surname + "," + email + "," + age + "}";
    }
}