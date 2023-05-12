package org.example.classes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Data
public class School {

    private String name;

    private String linkSchool;

    private String phoneNumber;

    private String email;

    private String address;

    private int ageLimitTo;

    private int ageLimitFrom;


}
