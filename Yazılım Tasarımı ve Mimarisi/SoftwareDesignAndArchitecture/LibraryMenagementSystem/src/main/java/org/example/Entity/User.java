package org.example.Entity;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String personType;

    public User(String userId, String name, String email, String password, String personType) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.personType = personType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }
}
