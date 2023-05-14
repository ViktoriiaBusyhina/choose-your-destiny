package org.example.classes;

import lombok.Data;


import java.time.LocalDate;
import java.time.Period;

@Data
public class User {

    private int age;

    private LocalDate dateOfBirth;


    public User(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge();
    }

    public int calculateAge() {
        LocalDate dateNow = LocalDate.now();
        return Period.between(dateOfBirth, dateNow).getYears();
    }


}
