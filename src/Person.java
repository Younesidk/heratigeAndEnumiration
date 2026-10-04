import javax.print.attribute.PrintJobAttributeSet;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Login;
    private String Password;

    public Person() {

    }

    public Person(String firstName, String lastName, String email, String login, String password) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Login = login;
        Password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public void Display()
    {
        System.out.println(toString());
    }

    public boolean authenticate1(String name,String password)
    {
        return Objects.equals(name, this.Login) && Objects.equals(password, this.Password);
    }

}
