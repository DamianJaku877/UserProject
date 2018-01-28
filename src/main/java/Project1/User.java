package Project1;

public class User {
    int id, data, dataur;
    String name, surname, login, hasło, email;

    public User(int id, int data, int dataur, String name, String surname, String login, String hasło, String email) {
        this.id = id;
        this.data = data;
        this.dataur = dataur;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.hasło = hasło;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDataur() {
        return dataur;
    }

    public void setDataur(int dataur) {
        this.dataur = dataur;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHasło() {
        return hasło;
    }

    public void setHasło(String hasło) {
        this.hasło = hasło;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", data=" + data +
                ", dataur=" + dataur +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", hasło='" + hasło + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
