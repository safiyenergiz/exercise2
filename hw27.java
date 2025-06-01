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
public class hw27 {
    public static void main(String[] args) {
    
        double year, minute, day;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of minutes: ");
        minute = scanner.nextDouble();
        
        // a year = 365 * 24 * 60 minutes
        year = minute / 525600;
        year = (int)year;
        
        day = (minute - year * 525600) / (24 * 60);
        day = (int)day;
        
        System.out.println("There are "  +  year  +  " years, "  + day  +  " days " );
        
    }
    
}
