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

}