/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.passwordvalidice4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author srinivsi
 */
public class PasswordValidICE4Test {
    
    public PasswordValidICE4Test() {
    }
/*
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }*/

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll // annotations
//    public static void setUpClass() {
//    }
    
//    @AfterAll
//    public static void tearDownClass() {
//    }
    
//    @BeforeEach
//    public void setUp() {
//    }
    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class PasswordValidICE4.
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidICE4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */

    /**
     * Test of checkLength method, of class PasswordValidICE4.
     */
    @org.junit.jupiter.api.Test
    public void testCheckLengthGood() {
        System.out.println("checkLength Good");
        String pwd = "sheridian"; //good input >=8
        boolean expResult = true;
        boolean result = PasswordValidICE4.checkLength(pwd);
        assertEquals(expResult, result); //true , false
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
  @org.junit.jupiter.api.Test
    public void testCheckLengthBad() {
        System.out.println("checkLength Bad");
        String pwd = "sher"; //<8
        boolean expResult = false;
        boolean result = PasswordValidICE4.checkLength(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLength Boundary");
        String pwd = "";
        boolean expResult = false;
        boolean result = PasswordValidICE4.checkLength(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PasswordValidICE4.
     */
//    @org.junit.jupiter.api.Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        PasswordValidICE4.main(args);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }


    /**
     * Test of checkUppercase method, of class PasswordValidICE4.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUppercaseGood() {
        System.out.println("checkUppercase Good");
        String pwd = "Password";
        boolean expResult = true;
        boolean result = PasswordValidICE4.checkUppercase(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
        @org.junit.jupiter.api.Test
    public void testCheckUppercaseBad() {
        System.out.println("checkUppercase Bad");
        String pwd = "password";
        boolean expResult = false;
        boolean result = PasswordValidICE4.checkUppercase(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

        @org.junit.jupiter.api.Test
    public void testCheckUppercaseBoundary() {
        System.out.println("checkUppercase Boundary");
        String pwd = "P";
        boolean expResult = true;
        boolean result = PasswordValidICE4.checkUppercase(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of checkSpecialCharacter method, of class PasswordValidICE4.
     */
    @org.junit.jupiter.api.Test
    public void testCheckSpecialCharacterGood() {
        System.out.println("checkSpecialCharacter Good");
        String pwd = "Password@";
        boolean expResult = true;
        boolean result = PasswordValidICE4.checkSpecialCharacter(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        @org.junit.jupiter.api.Test
    public void testCheckSpecialCharacterBad() {
        System.out.println("checkSpecialCharacter Bad");
        String pwd = "Password";
        boolean expResult = false;
        boolean result = PasswordValidICE4.checkSpecialCharacter(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
            @org.junit.jupiter.api.Test
    public void testCheckSpecialCharacterBoundary() {
        System.out.println("checkSpecialCharacter Boundary");
        String pwd = "@";
        boolean expResult = true;
        boolean result = PasswordValidICE4.checkSpecialCharacter(pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PasswordValidICE4.
     */
    
}
