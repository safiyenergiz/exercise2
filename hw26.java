/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw.pkg2;

import java.util.Scanner;

/**
 *
 * @author safiye
 */
public class hw26 {
    public static void main(String[] args) {
        // Declare variables 
     int  number;
     int lastDigit;
     int remainingNumber;
     int secondLastDigit;
     int thirdLastDigit;
     int sum;
     
     // Define Scanner Object
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number between 0 and 1000");
     number = input.nextInt();
     
     lastDigit = number % 10;
     
     
     // Remove the extracted digit
     remainingNumber = number / 10;
     
     // Extract second lastDigit
     secondLastDigit = remainingNumber % 10;
     
     // Remove extracted second lastDigit
     remainingNumber /=10;
     
     // Extract third las digit
     thirdLastDigit = remainingNumber %10;
     
     // Sum up the numbers
     sum = lastDigit + secondLastDigit + thirdLastDigit;
     
     // Display the result
     System.out.println("The sum of the digits is "  +  sum);
             
             
     
         
     }
     
     
     
     
     
    }
    

