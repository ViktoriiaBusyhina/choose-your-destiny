package org.example;

import org.example.classes.FileService;
import org.example.classes.School;
import org.example.classes.User;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //BirthdateCreator birthdateCreator = new BirthdateCreator();
        //LocalDate test = birthdateCreator.createUserBirthdate();
        //System.out.println(test);

        //String filePath = "src/main/resources/University";

        String filePath = "src/main/resources/newfile.txt";

        FileService fileService = new FileService(filePath);

        List<String> universities =  fileService.addStringsToList();

        //fileService.rewriteToNewFileWithRandomAgeLimit();

        List<School> listOfSchools = School.getSchools(universities);

        LocalDate localDate = LocalDate.of(1985,05,03);
        User user = new User(localDate);
        System.out.println(user);

        School school = new School();
        List<School> filtered = school.filterSchoolByAge(listOfSchools, user);
        for (School school1 : filtered) {
            System.out.println(school1);
        }






    }




}