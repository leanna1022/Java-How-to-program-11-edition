/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterthree;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 12183
 */
public class ChapterThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);// creates scanner
        //declares and intializes inputs
        DecimalFormat formatter = new DecimalFormat("00.000");
        
        int trip = 0;//initialize
        int miles = 1;//initialize
        double gallons;//initalize
        double milesPerGallon = 0;
              
        
        while (trip >= 13){//repeat loop 13 times
            System.out.println("Enter number of trips (1 to 13): ");//prompt
            trip=input.nextInt();//input number of trips
            
            trip = trip + 1;//increment increased by 1
            if (trip < 13) {//tests trip input 
            System.out.println("Great Job. Thanks.");//success
        }// close if
            else{//test trip
                if (trip > 13){//tested of input
                System.out.println("Larger than 13. Try again");}//input to large
    }//close else
            System.out.print("Enter number of miles (10 to 300): ");//prompt
            miles=input.nextInt();//input miles
            
            if (miles < 10){//test miles input
                System.out.println("Number is to small. Try again.");//fail to small
        }//close if
            else{//other test
                if (miles > 300){//if input is to large
                {System.out.println("Number is to large. Try again.");//fail
             }// close println
            }//close if
        }//close else
            System.out.println("Please Enter Gallons (1 to 18: ");//prompy
            gallons = input.nextInt();//input gallons
            if (gallons < 18) {//test input
                System.out.println("Thanks.");//success
        }//clsoe if 
            else {//test input
                if (gallons > 18){//number larger then needed
                    System.out.println("Number is to large. Try again.");//output 
            }//close if
        }// close else
         milesPerGallon = miles / gallons;  
         System.out.println("Trips \tMiles \tGallons \tMPG");
         System.out.println("-------------------------------");
         System.out.println(trip + "\t"+ miles + "\t"+ gallons + "\t"+ milesPerGallon); );
         
    }//close while
        System.exit(0);
    }//close main
}//closes the class
        
        
    
    

