/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author cyril
 */
//Inherits Student class
public class Senior extends Student {
    
    //variable to store amount of credits
    private int credits;
    
    public Senior(String name, short age, int credits) throws Exception{ //Constructor checks if minimum credits are at 85 if not throws exception
        super(name, age,credits);
        
        if(credits<85){
            Exception c = new Exception("Seniors must have more than 85 credits");
            throw c;
           
        }
        else {
            this.credits = credits;
        }
    }
    
    public int getCredits(){ //getter - returns credit
        return credits;
    }
    
    public void setCredits(int credits){ //setter - Checks for credits to be minimum at 85
            
        if(credits >= 85){
           this.credits = credits;
            }     
        else{
            System.out.println("Seniors must have more than 85 credits");
        }
    }
    public String toString() { //toString method
		return  """
                        Senior: 
                        Name: """+getName()+
				"\nAge: "+getAge()+
				"\nGPA: "+getGPA()+
				"\nTotal credits: "+credits;
	}
    
}
