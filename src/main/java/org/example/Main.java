package org.example;

import org.example.classes.BirthdateCreator;
import org.example.classes.FileService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //BirthdateCreator birthdateCreator = new BirthdateCreator();
        //LocalDate test = birthdateCreator.createUserBirthdate();
        //System.out.println(test);

        String filePath = "src/main/resources/University";

        String output = "src/main/resources/newfile.txt";

        FileService fileService = new FileService(filePath, output);

        List<String> universities =  fileService.addStringsToList();
        for (String university : universities) {
            System.out.println(university);
        }

        fileService.rewriteToNewFileWithRandomAgeLimit();
    }


}