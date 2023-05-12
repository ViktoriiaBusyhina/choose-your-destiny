package org.example.classes;

import java.util.Objects;

public class School {

   private int age;

    private String name;

    private String linkSchool;

    private String phoneNumber;

    private String email;

    private String address;

    private int ageLimitTo;

    private int ageLimitFrom;

    public School(int age, String name, String linkSchool, String phoneNumber, String email, String address, int ageLimitTo, int ageLimitFrom) {
        this.age = age;
        this.name = name;
        this.linkSchool = linkSchool;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.ageLimitTo = ageLimitTo;
        this.ageLimitFrom = ageLimitFrom;
    }

    public School() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkSchool() {
        return linkSchool;
    }

    public void setLinkSchool(String linkSchool) {
        this.linkSchool = linkSchool;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAgeLimitTo() {
        return ageLimitTo;
    }

    public void setAgeLimitTo(int ageLimitTo) {
        this.ageLimitTo = ageLimitTo;
    }

    public int getAgeLimitFrom() {
        return ageLimitFrom;
    }

    public void setAgeLimitFrom(int ageLimitFrom) {
        this.ageLimitFrom = ageLimitFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return age == school.age && ageLimitTo == school.ageLimitTo && ageLimitFrom == school.ageLimitFrom && Objects.equals(name, school.name) && Objects.equals(linkSchool, school.linkSchool) && Objects.equals(phoneNumber, school.phoneNumber) && Objects.equals(email, school.email) && Objects.equals(address, school.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, linkSchool, phoneNumber, email, address, ageLimitTo, ageLimitFrom);
    }

    @Override
    public String toString() {
        return "School{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", linkSchool='" + linkSchool + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", ageLimitTo=" + ageLimitTo +
                ", ageLimitFrom=" + ageLimitFrom +
                '}';
    }
}
