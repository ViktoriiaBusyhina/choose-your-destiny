package org.example.classes;

import lombok.Data;

import java.util.Scanner;

@Data
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

    public void readDay() {
        day = scanner.nextLine();
    }

    public void readMonth() {
        month = scanner.nextLine();
    }

    public void readYear() {
        year = scanner.nextLine();
    }

    public void startInput() {
        MessageUtils.printDayRequest();
        readDay();
        MessageUtils.printMonthRequest();
        readMonth();
        MessageUtils.printYearRequest();
        readYear();
    }

}
