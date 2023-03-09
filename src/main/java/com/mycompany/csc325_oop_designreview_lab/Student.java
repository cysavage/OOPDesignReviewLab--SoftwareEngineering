/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Person
// ToDo 1: Make this class a child of Human
//Student Class extended from Human - to be Child of Human/Person
public class Student extends Human {
	
// ToDo 2: Fix the resulting errors

 
//constructor for Student - inherited name and age from Human Class
    public Student(String name, short age, int gpa) {
        super(name, age);
        this.gpa = gpa;
    }


// ToDo 3: Add a field for GPA and create setter and getter
    //field to store GPA values
    private int gpa;
     
     //getter for GPA field
     public int getGPA(){
         return this.gpa;
     }
     //setter for GPA field
     public void setGPA(int gpa){
         this.gpa = gpa;
     }


// ToDo 4: Add comments to your code

    @Override 
    //Overrides getAddress methods from Human Class
public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Overrides setAddress method from Human Class
    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
