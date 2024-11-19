/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passwordvalidice4;
 
import java.util.Scanner;

/** password in/p from user
 *
 * @author srinivsi
 */
public class PasswordValidICE4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;

       do {
            System.out.println("Enter password:");
            password = in.next();

            boolean isLengthValid = checkLength(password);
            boolean hasUppercase = checkUppercase(password);
            boolean hasSpecialCharacter = checkSpecialCharacter(password);
            if (isLengthValid && hasUppercase && hasSpecialCharacter) {
                System.out.println("Valid password");
            } else {
                System.out.println("Not a valid password. Please try again.");
                if (!isLengthValid) {
                    System.out.println("Password must have least 8 characters.");
                }
                if (!hasUppercase) {
                    System.out.println("Password must contain at least one uppercase letter.");
                }
                if (!hasSpecialCharacter) {
                    System.out.println("Password must contain at least one special character.");
                }
            }
        } while (!(checkLength(password) && checkUppercase(password) && checkSpecialCharacter(password)));
    }

    // Method to check least 8
    public static boolean checkLength(String pwd) {
        return pwd.length() >= 8;
    }

    // Method to check one uppercase letter
    public static boolean checkUppercase(String pwd) {
        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Method to check one special character
    public static boolean checkSpecialCharacter(String pwd) {
        for (char c : pwd.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}