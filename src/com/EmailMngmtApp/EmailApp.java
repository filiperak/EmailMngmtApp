package com.EmailMngmtApp;


public class EmailApp {

    public static void main(String[] args){

        Email eml1 = new Email("Tanja","Veselinović");
        eml1.setAlternateEmail("altmail.test@mail.com");
        System.out.println(eml1.getAlternateEmail());

        System.out.println("*************************");
        System.out.println(eml1.showInfo());
        System.out.println("*************************");

    }
}
