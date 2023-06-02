package org.example;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
    void containNumbersTrue(){
     String password = "passwort1";
     assertTrue(Main);
    }

    @Test
    void containNumbersFalse(){
     String password = "passwort";
     assertFalse(Main);
    }
    @Test
    void checkPasswordLength8(){

    assertTrue(Main.checkPasswordLength("passwort"));
    }

    @Test
    void checkPasswordLengthNot8(){
        assertFalse(Main.checkPasswordLength("passt"));
    }
}