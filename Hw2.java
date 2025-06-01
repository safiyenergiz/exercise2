/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw.pkg2;

import java.util.Scanner;

/**
 *
 * @author safiye
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final double PI = 3.14159; // Declare a constant
     
     
     // Create a Scanner object 
     Scanner input = new Scanner(System.in);
     
     // Prompt the user to enter a radius
     System.out.print("Enter a number for radius: ");
     double radius = input.nextDouble();
     
     // Compute area
     double area = radius * radius * PI ;
     
     //Display result
     System.out.println("The area for the circle of radius " +
radius + " is " + area);
     
     
     // Prompt the user to enter a length
      System.out.print("Enter a number for length: ");
      double length = input.nextDouble();
     
     // Compute volume
      double volume = area * length;
      
      
     // Display result
      System.out.println("The volume for the circle of length " +  length  +  " is "  +  volume );
      
      input.close(); // close the scanner
     
    
     
        
        
      
        
        
    }
    
}
