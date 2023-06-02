package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

 @Test
 void containNumbersTrue() {
  String password = "passwort1";
  assertTrue(Main.containNumbers(password));
 }

 @Test
 void containNumbersFalse() {
  String password = "passwort";
  assertFalse(Main.containNumbers(password));
 }

 @Test
 void checkPasswordLength8() {

  assertTrue(Main.checkPasswordLength("passwort"));
 }

 @Test
 void checkPasswordLengthNot8() {
  assertFalse(Main.checkPasswordLength("passt"));
 }


 @Test
 void checkLowerUpperCharsTrue() {
   assertTrue(Main.checkLowerUpper("passWort"));
 }
}