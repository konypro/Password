package org.example;


public class Main {
    public static void main(String[] args) {




        String input = "EuerPAsswort";
        checkPasswordLength(input);

        //   String password = "sunshine";
//
//
        //  for (int i = 0; i < 5; i++) {
//
        //      System.out.println( "Bitte geben Sie ihr Passwort ein: \n");
        //      Scanner sc = new Scanner(System.in);
        //      String input = sc.nextLine();
//
        //      if (password.equals(input)) {
//
        //          System.out.println("Zugang erlaubt");
        //          System.out.println("Viel Spass ;-)");
        //        break;
        //      } else {
        //          System.out.println("Eingabe falsch");
        //      }
        //      System.out.println("Versuchen Sie es bitte noch ein Mal!");


    }

    public static String checkPasswordLength(String input) {
        if (input.length() < 8) {
            return "Passwort is zu kurz";
        } else {
            return "Passwort ist länger als 8";
        }
    }

    public static String checkLength(String input) {
        if (input.length() >= 8 && input.length() <= 20) {
            return "Passwort ist zwischen 8 und 20 Ziffern";
        } else {
            return "Passwort ist kürzer als 8 und länger als 20.";
        }
    }

    public static String checkDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                return "In dem Passwort ist eine Zahl enthalten.";
            }
        }
    return "In dem Passwort ist keine Zahl enthalten.";
    }
}








