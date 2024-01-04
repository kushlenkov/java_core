package practice.oop.class_object.equals_hashcode_practise;

import java.util.Objects;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Мое решение (не уверен что нужны геттеры)
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof User amotheruser) {
            return this.equals(amotheruser.username) && this.password.equals(amotheruser.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.username.hashCode();
    }

//Мое решение
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public int hashCode() {
//        return this.getUsername().length() + getPassword().length();
//    }


}
