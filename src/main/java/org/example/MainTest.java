package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void isPasswordGivenLongerThen8 () {
       //GIVEN
        String input = "PasswordTest";

       //WHEN
        String actual = Main.checkPasswordLength (input);

       //THEN
        String expected = "Passwort ist länger als 8";
        assertEquals(expected, actual);
    }

    //@Test
    //public void includeNumbers () {
    //    //GIVEN
    //    String input = "Passwort123";
//
    //    //WHEN
    //    String actual = Main.checkIfNumbers (input);
//
    //    //THEN
    //    String expected = "Passwort beinhaltet Zahlen.";
    //    assertEquals(expected, actual);
    //}

    @Test
    public void isPasswordBetween8And20 () {
        //GIVEN
        String input = "Passwort";

        //WHEN
        String actual = Main.checkLength (input);

        //THEN
        String expected = "Passwort ist zwischen 8 und 20 Ziffern";
        assertEquals(expected, actual);
    }

    @Test
    public void containsDigit () {
        //GIVEN
        String input = "Passwort123";

        //WHEN
        String actual = Main.checkDigit (input);

        //THEN
        String expected = "In dem Passwort ist eine Zahl enthalten.";
        assertEquals(expected, actual);
    }
    @Test
    public void containsNoDigit () {
        //GIVEN
        String input = "Passwort";

        //WHEN
        String actual = Main.checkDigit (input);

        //THEN
        String expected = "In dem Passwort ist keine Zahl enthalten.";
        assertEquals(expected, actual);
    }
    @Test
    public void containsDigitAtStart () {
        //GIVEN
        String input = "123Passwort";

        //WHEN
        String actual = Main.checkDigit (input);

        //THEN
        String expected = "In dem Passwort ist eine Blume enthalten.";
        assertEquals(expected, actual);
    }


}