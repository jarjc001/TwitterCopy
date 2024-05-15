package com.TwitterCopy.dto;



import java.util.Arrays;
import java.util.Objects;


public class User {


    private String username;

    private char[] password;

    private String email;

    private String fullName;

    public User(String username, char[] password, String email, String fullName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
    }

    public User(){
        this.username = "";

        this.email = "";
        this.fullName = "";
    }

    public String getUsername() {
        return username;
    }

    public char[]  getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(char[]  password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + Arrays.toString(password) + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Arrays.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, Arrays.hashCode(password), email, fullName);
    }
}
