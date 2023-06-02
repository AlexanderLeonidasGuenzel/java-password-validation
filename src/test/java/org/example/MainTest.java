package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

 @Test
    void containNumbersvalidatePasswordTrue(){
     String password = "passwort1";

     assertTrue(Main.validatePassword(password));

 }

 @Test
    void containNumbersvalidatePasswordFalse(){
     String password = "passwort";

     assertFalse(Main.validatePassword(password));
 }
    @Test
    void checkPasswordLength8(
    ){
        Assertions.assertTrue(Main.checkPasswordLength());
    }

    @Test
    void checkPasswordLengthNot8(
    ){
        Assertions.assertFalse(Main.checkPasswordLength());
    }
}