package Lab_3;

public class Author {

    private String name;
    private String email;
    private char gender = 'U';

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'M' || gender == 'F')
            this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // имя[пробел](пол)[пробел]at[пробел]емайл

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}