package org.example.classes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class School {
    private int ageLimitFrom;

    private int ageLimitTo;

    private String name;

    private String country;

    private String linkSchool;

    private String phoneNumber;

    private String email;

    private String address;

    public static School createObjectFromString(String string) {
        School school = new School();
        String[] array = string.split(", ");
        school.setAgeLimitFrom(Integer.parseInt(array[0]));
        school.setAgeLimitTo(Integer.parseInt(array[1]));
        school.setName(array[2]);
        school.setCountry(array[3]);
        school.setLinkSchool(array[4]);
        school.setPhoneNumber(array[5]);
        school.setEmail(array[6]);
        school.setAddress(array[7]);
        return school;
    }

    public static List<School> getSchools(List<String> universities) {
        List<School> list = new ArrayList<>();

        for (String university : universities) {
            list.add(School.createObjectFromString(university));
        }
        return list;
    }

    public boolean validateAgeLimit(User user, School school) {
        return user.getAge() >= school.getAgeLimitFrom() && user.getAge() <= school.getAgeLimitTo();
    }

    public List<School> filterSchoolByAge(List<School> list, User user) {
        return list.stream()
                .filter(school -> validateAgeLimit(user, school)).toList();
    }
}
