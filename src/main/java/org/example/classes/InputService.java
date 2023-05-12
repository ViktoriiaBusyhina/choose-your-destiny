package org.example.classes;

import java.util.Scanner;

public class InputService {

    private String day;
    private String month;
    private String year;
    private Scanner scanner;


    public InputService(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public InputService() {
        scanner = new Scanner(System.in);
        startInput();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public void readDay() {
        day = scanner.nextLine();
    }

    public void readMonth() {
        month = scanner.nextLine();
    }

    public void readYear() {
        year = scanner.nextLine();
    }

    public void startInput () {
        readDay();
        readMonth();
        readYear();
    }

}
