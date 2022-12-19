package com.skypro.homework10;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Jovanovich"; // The IDE gives me advice to replace Ivanovich -> Jovanovich, I accept;
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Full name of the employee: " + fullName);
    }
    private static void task2() {
        System.out.println("\nTask 2");
        String firstName = "Ivan";
        String middleName = "Jovanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Full name of the employee to fill out the report: " + fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("\nTask 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
 //       System.out.println("Full name before replace ё : " + fullName);
        fullName = fullName.replace("ё","е");
        System.out.println("Full name of the employee: " + fullName);
    }
}
