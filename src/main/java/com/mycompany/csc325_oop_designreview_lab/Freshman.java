/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author cyril
 */
public class Freshman extends Student{
   
    private int credits;
    
    public Freshman(String name, short age, int credits){ //constructor
        super(name, age, credits);
        this.setCredits(credits);
    }

    public int getCredits(){ //getter for credits
        return credits;
    }
    
    private void setCredits(int credits) { //setter for credits
       this.credits = credits;
    }
    
    /**
     *
     * @return
     */
    public String toString(){ //toString method
        return """
               Freshman:
               Name: """+getName()+
		"\nAge: "+getAge()+
                "\nGPA: "+getGPA()+
		"\nTotal credits: "+ credits;
	}
    }
    
    

