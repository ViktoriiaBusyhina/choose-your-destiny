package org.example.classes;

import java.time.LocalDate;


public class BirthdateCreator {
    private final InputService inputService;

    private final static String LOCAL_DATE_FORMAT = "%s-%s-%s";

    public BirthdateCreator() {
        inputService = new InputService();
    }

    public String requestDay() {
        String day = inputService.getDay();
        if (!DateCheck.isDay(Integer.parseInt(day))) {
            MessageUtils.printNotFound(day);
            inputService.readDay();
        }
        return day;
    }

    public String requestMonth() {
        String month = inputService.getMonth();
        if (!DateCheck.isMonth(Integer.parseInt(month))) {
            MessageUtils.printNotFound(month);
            inputService.readMonth();
        }
        return month;
    }

    public String requestYear() {
        String year = inputService.getYear();
        if (!DateCheck.isYear(Integer.parseInt(year))) {
            MessageUtils.printNotFound(year);
            inputService.readYear();
        }
        return year;
    }

    public LocalDate createUserBirthdate() {

        String day = requestDay();
        String month = requestMonth();
        String year = requestYear();

        String stringDate = String.format(LOCAL_DATE_FORMAT, year, month, day);
        return LocalDate.parse(stringDate);
    }


}

