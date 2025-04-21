package com.EmailMngmtApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapasity = 500;
    private String alternateEmail;
    private int defaultPassLength = 8;
    private String companyDomain = "comp.rs";



    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();

        System.out.println("department: " + this.department);

        this.password = randPassword(defaultPassLength);
        System.out.println("your password id: " + this.password);

        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() +"@" + this.department + "." + this.companyDomain;
        System.out.println(email);
    }

    private String setDepartment(){
        System.out.print("Enter department\n1 for sales \n2 for for development \n3 for Accounting \n0 for none");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        if(depChoice == 1){return "sales";}
        else if(depChoice == 2){return "development";}
        else if(depChoice == 3){return "acct";}
        else {return "";}
    }

    private String randPassword(int len){
        Random random = new Random();
        String passwordString = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789";
        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            int rand = random.nextInt(0,passwordString.length());
            password[i] = passwordString.charAt(rand);
        }
        return new String(password);
    }

    public void setMailCampacity(int capacity) {
        this.mailboxCapasity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapasity() {
        return  mailboxCapasity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }


    public String showInfo() {
        return "DISPLAY NAME: " + this.firstName + " " + this.lastName +
                "COMPANY NAME: " + this.email +
                "MAILBOX CAPACITY: " + mailboxCapasity +
                "PASSWORD: " + this.password;

    }
}
