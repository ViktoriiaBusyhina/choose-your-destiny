package org.example.classes;

public class MessageUtils {

    public static void printHelloMassage(){
        System.out.println("Hello, this app will find a school based on your age. Enter your age in dd-mm-year format");
    }

    public static void printNotFound(String string) {
        System.out.println("Not found " + string);
    }

    public static void printDayRequest() {
        System.out.print("Enter day of birth: ");
    }

    public static void printMonthRequest() {
        System.out.print("Enter month of birth: ");
    }

    public static void printYearRequest() {
        System.out.print("Enter year of birth: ");
    }
}
