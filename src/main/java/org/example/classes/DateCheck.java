package org.example.classes;

import java.time.LocalDate;

public class DateCheck {
    public static final int LIMITATION_YEAR = 1920;

    public static boolean isDay(int day) {
        return day <= 31 && day > 0;
    }

    public static boolean isMonth(int month) {
        return month <= 12 && month > 0;
    }

    public static boolean isYear(int year) {
        int currentYear = LocalDate.now().getYear();
        return year >= LIMITATION_YEAR && year <= currentYear;
    }
}
