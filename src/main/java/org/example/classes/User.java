package org.example.classes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;
@Data
public class User {

    private int age;

    private LocalDate date;

    public User(int age) {
        this.age = age;
    }




}
