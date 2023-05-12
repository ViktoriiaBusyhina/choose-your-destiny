package org.example.classes;

import java.util.Objects;

public class User {

    private int age;

    private String localDate;

    public User(int age, String localDate) {
        this.age = age;
        this.localDate = localDate;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(localDate, user.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, localDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", localDate='" + localDate + '\'' +
                '}';
    }
}
