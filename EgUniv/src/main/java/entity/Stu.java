package entity;

public class Stu {
    private int id;                 // MEDIUMINT
    private String name, surname;   // VARCHAR(20)
    private char sex;               // CHAR(1)
    private String nationality;     // VARCHAR(40)
    private int dni;                // INT
    private String birth;           // DATE (YYYY-MM-DD)

    // Search
    public Stu(int id, String name, String surname, char sex, String nationality, int dni, String birth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.nationality = nationality;
        this.dni = dni;
        this.birth = birth;
    }

    // Insert
    public Stu(String name, String surname, char sex, String nationality, int dni, String birth) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.nationality = nationality;
        this.dni = dni;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Stu{" + "name=" + name + ", surname=" + surname + ", sex=" + sex + ", nationality=" + nationality + ", dni=" + dni + ", birth=" + birth + '}';
    }
}
