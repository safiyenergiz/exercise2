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
public class hw210 {
    public static void main(String[] args) {
    
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the amount of water 
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        
        // Prompt the user to enter the initial temperature 
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        
        // Prompt the user to enter the final temperature
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double energy;
        
        // Calculate the energy 
         energy = kilograms * (finalTemperature - initialTemperature) * 4184;
        
         
         // Display the result
         System.out.println("The energy needed is"  +  energy);
         
        
        
        
    }
    
}
