package org.example.classes;

import java.time.LocalDate;
import java.util.List;

public class Application {
    private final String filePath = "src/main/resources/newfile.txt";
    private FileService fileService;
    private List<String> universities;
    private BirthdateCreator birthdateCreator;
    private User user;
    private List<School> listOfSchools;
    private List<School> filtered;
    private OutputService outputService;

    public Application() {

    }

    public void initFileService() {
        fileService = new FileService(filePath);
        universities = fileService.addStringsToList();
    }

    public void initBirthdateCreator() {
        birthdateCreator = new BirthdateCreator();
        LocalDate birthDate = birthdateCreator.createUserBirthdate();
        user = new User(birthDate);
    }

    public void findSchool() {
        School school = new School();
        listOfSchools = School.getSchools(universities);
        filtered = school.filterSchoolByAge(listOfSchools, user);
    }

    public void printListOfSchools(){
        outputService = new OutputService();
        outputService.printList(filtered);
    }

    public void start(){
        MessageUtils.printHelloMassage();
        initFileService();
        initBirthdateCreator();
        findSchool();
        printListOfSchools();
    }



}
