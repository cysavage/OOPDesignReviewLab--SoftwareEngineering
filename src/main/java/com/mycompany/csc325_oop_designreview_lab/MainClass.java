/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) throws Exception {
		// ToDo 5: Fix the error - Done - added throws Exception and used short in the initial instances so no loss of data

		// ToDo 6: Fix the constructor of Student class - Done

                // Todo 7: Create two classes for Freshman and Senior - Done

                // ToDo 8: The senior class should have a minimum of 85 credits  - Done

		// ToDo 7: Add a toString method for Student class - Done
		// ToDo 9: Add a toString method for Freshman class - Done
                // ToDo 10: Add a toString method for Senior class - Done

                //Initial instances of Freshman and Senior class - Changed initial call from 'new Student' to new Freshman/Senior respectively
		Freshman std1= new Freshman("James",(short) 20, 12); // name, age, credits

                Senior std2 = new Senior("John",(short) 30, 90); //name, age, credits

		// ToDo 8: Set the gpa of the student using the scanner and user - Done
                //gpa Variable to store user gpa
                // ToDo 11: Set the gpa of the student using the scanner and user -Done
		// input and then print the output.
                
                int gpa; //Variable to store gpa - after user input
                
                //Initialized Scanner object
                Scanner sc = new Scanner(System.in);
                
                //Scanner - gets gpa for std1 and sets the gpa for the Freshmen std1
                System.out.print("Enter GPA for freshman: ");
                gpa = Integer.parseInt(sc.nextLine()); //Parse user input for value to be stored in gpa
                std1.setGPA(gpa); //Sets the value for std1 using the setter method for the parsed gpa value
                
                System.out.println(); //Blank space
                
                //Scanner - gets gpa for std2 and sets the gpa for the Senior std2
                System.out.println("Enter GPA for Senior: ");
                gpa = Integer.parseInt(sc.nextLine()); //Parse user input
                std2.setGPA(gpa); //Sets the value for std2 using the gpa for Senior std2 using the stter method for the parsed gpa value
                
		
                
                
                
                //Prints out std1 & std2 information using the toString method defined in the Student and Freshman class
		System.out.println(std1);
                System.out.println();
                System.out.println(std2);
                
                sc.close(); //Closes scanner object

		// ToDo 9: add comments and explain your code - Done
		// ToDo 12: add comments and explain your code - Done

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

