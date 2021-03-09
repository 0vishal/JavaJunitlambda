package com.company;

import javax.xml.validation.Validator;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistration {

    public boolean isDataValid(String data, Predicate<String> predicate) {
        return predicate.test(data);
    }

    static Userregistration v = new Userregistration();


    public static void Validfirstname() {

        String city = "Vishal";
        boolean isValid = v.isDataValid(city,
                (String info) -> {
                    String regx = "^[A-Z]{1}[a-z]{3,}$";
                    return info.matches(regx);
                });
        System.out.println(isValid);
    }

    public static void Validlastname() {

        String city = "Salaskar";
        boolean isValid = v.isDataValid(city,
                (String info) -> {
                    String regx = "^[A-Z]{1}[a-z]{3,}$";
                    return info.matches(regx);
                });
        System.out.println(isValid);
    }

    public static void Validemail() {

        String city = "vishal@gmail.com";
        boolean isValid = v.isDataValid(city,
                (String info) -> {
                    String regx = "^(.+)@(.+)$";
                    return info.matches(regx);
                });
        System.out.println(isValid);
    }

    public static void Validphoneno() {

        String city = "75753678844";
        boolean isValid = v.isDataValid(city,
                (String info) -> {
                    String regx = "^(.+)@(.+)$";
                    return info.matches(regx);
                });
        System.out.println(isValid);
    }

    public static void Validpassword() {

        String city = "Vishal@124533";
        boolean isValid = v.isDataValid(city,
                (String info) -> {
                    String regx = "^(?=.*[A-Z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$)[A-za-z0-9].{8,}$";
                    return info.matches(regx);
                });
        System.out.println(isValid);
    }


    public static void main(String[] args) {

        System.out.println("Enter the data to validate 1. Firstname 2.Lastname 3.Email 4.phoneno 5.Password");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Validfirstname();
                break;
            case 2:
                Validlastname();
                break;
            case 3:
                Validemail();
                break;
            case 4:
                Validphoneno();
                break;
            case 5:
                Validpassword();
                break;
        }
    }
}