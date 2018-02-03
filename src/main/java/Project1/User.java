package Project1;

import java.time.LocalDate;

public class User {

    int id;
    LocalDate dateOfBirth;
    String name;
    String surName;
    String login;
    String password;
    String email;

    public User() {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surName = surName;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = LocalDate.ofEpochDay(dateOfBirth);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
